#!/bin/bash

WRAPPER_PROPERTIES="gradle/wrapper/gradle-wrapper.properties"

if [ ! -f "$WRAPPER_PROPERTIES" ]; then
    echo "ERROR: gradle-wrapper.properties not found. Please run 'gradle wrapper' to generate it."
    exit 1
fi

GRADLE_VERSION=$(grep -oP 'distributionUrl=\K.*(?=/gradle)' "$WRAPPER_PROPERTIES")

DOWNLOAD_URL="https://services.gradle.org/distributions/gradle-$GRADLE_VERSION-bin.zip"

if command -v gradle &>/dev/null; then
    gradle "$@"
else
    echo "Gradle not found. Downloading and using local Gradle version $GRADLE_VERSION..."
    curl -sLO "$DOWNLOAD_URL"
    unzip -q "gradle-$GRADLE_VERSION-bin.zip"
    rm -f "gradle-$GRADLE_VERSION-bin.zip"
    "./gradle-$GRADLE_VERSION/bin/gradle" "$@"
fi

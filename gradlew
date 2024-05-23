#!/bin/bash
set -e

# Get the directory that this script is in
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"

# Set up environment variables
export GRADLE_HOME="${DIR}/gradle"
export GRADLE_USER_HOME="${DIR}/.gradle"
export GRADLE_OPTS="-Dorg.gradle.daemon=false"

# Run Gradle
"${DIR}/gradle" "$@"

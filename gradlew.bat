@echo off
setlocal

rem Get the directory that this script is in
SET "DIR=%~dp0"

rem Set up environment variables
SET "GRADLE_USER_HOME=%DIR%.gradle"
SET "GRADLE_OPTS=-Dorg.gradle.daemon=false"

rem Run Gradle
"%DIR%gradle" %*

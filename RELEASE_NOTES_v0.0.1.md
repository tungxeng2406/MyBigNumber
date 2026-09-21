# Release Notes v0.0.1

## Overview
This is the initial release of MyBigNumber, a Java + Spring Boot application that adds very large numbers represented as strings.

## Highlights
- Added custom large-number addition logic in the core module
- Implemented a simple web interface using Spring Boot and Thymeleaf
- Added input validation for non-numeric values
- Added unit tests covering basic arithmetic behavior
- Prepared the project for GitHub release and version tracking

## Included modules
- `core`: large-number calculation logic
- `web`: web UI and application entry point

## Usage
1. Build the project:
   ```bash
   mvn clean install
   ```
2. Run the web application:
   ```bash
   mvn -pl web spring-boot:run
   ```
3. Open the app in the browser:
   ```text
   http://localhost:8081/
   ```

## Example
Input:
- first number: `99999999999999999999`
- second number: `1`

Output:
```text
100000000000000000000
```

## Notes
- This project is intended for learning and demonstration purposes.
- The app is currently configured to run on port 8081.

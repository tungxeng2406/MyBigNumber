# MyBigNumber

A Java + Spring Boot project that performs addition for very large numbers using custom string-based arithmetic instead of relying on the built-in `BigInteger` type.

## Overview

This project is organized as a multi-module Maven application:

- `core`: contains the calculation logic for large-number addition
- `web`: contains the Spring Boot web application and Thymeleaf UI

It is designed to handle large numeric inputs safely and to validate invalid values, such as non-digit characters.

## Features

- Add two very large numbers represented as strings
- Validate numeric input strictly
- Display the result and calculation history in the web UI
- Multi-module Maven structure
- Java 17 + Spring Boot 3.3.3

## Project structure

```text
MyBigNumber/
├── pom.xml
├── README.md
├── .gitignore
├── core/
│   ├── pom.xml
│   └── src/
│       ├── main/java/com/example/mybignumber/MyBigNumber.java
│       └── test/java/com/example/mybignumber/MyBigNumberTest.java
├── web/
│   ├── pom.xml
│   └── src/
│       ├── main/java/com/example/mybignumber/web/
│       ├── main/resources/application.properties
│       └── main/resources/templates/index.html
└── web/target/
```

## Tech stack

- Java 17
- Maven
- Spring Boot 3.3.3
- Thymeleaf
- JUnit 5

## Build

From the project root:

```bash
mvn clean install
```

Or build only the web module:

```bash
mvn -pl web clean package
```

## Run the application

Run the web module:

```bash
mvn -pl web spring-boot:run
```

Then open in the browser:

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

## Version

Current release tag:

```text
v0.0.1
```

## Notes

- The application is configured to run on port `8081`.
- The core logic was validated with Unit Tests.
- The repo is ready for GitHub release management.

## License

This project is intended for learning, demonstration, and personal practice.

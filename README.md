# MyBigNumber

A Spring Boot multi-module project that adds two very large numbers using custom logic instead of relying on the built-in `BigInteger` type.

## Project Overview

This project is divided into two Maven modules:

- `core`: contains the arithmetic logic for large-number addition
- `web`: contains the Spring Boot web interface and controller

## Features

- Adds two large numeric strings safely
- Validates input to ensure only digits are accepted
- Shows each calculation step in the UI
- Supports running as a standalone Spring Boot application

## Tech Stack

- Java 17
- Maven
- Spring Boot 3.3.3
- Thymeleaf
- JUnit 5

## Project Structure

```text
Add2Number/
├── pom.xml
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
└── README.md
```

## Build

From the project root:

```bash
mvn clean install
```

Or build only the web module:

```bash
mvn -pl web clean package
```

## Run with Maven

```bash
mvn -pl web spring-boot:run
```

Then open:

```text
http://localhost:8081/
```

## Run the packaged JAR

After building the project:

```bash
java -jar web/target/web-0.0.1.jar --server.port=9090
```

Then open:

```text
http://localhost:9090/
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

- The app listens on port 8081 in the project config.
- Final standalone verification was done on port 9090 because some local ports were already in use.
- The arithmetic logic intentionally supports very large numbers as strings and avoids overflow issues.

## License

This project is for learning and demonstration purposes.

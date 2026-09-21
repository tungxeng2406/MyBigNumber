# Domain Model

## Core concept
The application handles addition of large numeric values represented as strings.

## Entities

### MyBigNumber
Represents the business logic for summing large integers.

Responsibilities:
- validate input strings
- strip leading zeros when needed
- compute addition digit by digit
- return a formatted result
- provide optional calculation history

### Input
Two numeric strings provided by the user via the web form.

### Output
A single numeric string containing the sum result.

## Rules
- Input must contain only digits
- Empty input is not allowed
- Leading zeros may be normalized
- The result is generated without relying on Java's `BigInteger`

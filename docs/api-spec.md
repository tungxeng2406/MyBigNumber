# API Specification

## Overview
The application exposes a small web API through a browser-based interface.

## Routes

### GET /
Returns the main screen of the calculator.

### POST /add
Accepts two form parameters:
- `firstNumber`
- `secondNumber`

Returns:
- the computed sum
- a history of operations
- validation errors when input is invalid

## Request example
```http
POST /add
Content-Type: application/x-www-form-urlencoded

firstNumber=99999999999999999999&secondNumber=1
```

## Response behavior
- On success: render the page with the result and history
- On invalid input: render the page with an error message

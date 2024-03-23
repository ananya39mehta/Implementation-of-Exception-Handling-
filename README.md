## Part 1

### RationalNumber Class

#### Methods:
1. `RationalNumber(int numerator, int denominator)`: Constructor to initialize a rational number with given numerator and denominator.
2. `add(RationalNumber other)`: Adds another rational number to the current rational number.
3. `subtract(RationalNumber other)`: Subtracts another rational number from the current rational number.
4. `multiply(RationalNumber other)`: Multiplies another rational number with the current rational number.
5. `divide(RationalNumber other)`: Divides the current rational number by another rational number.
6. `toDouble()`: Converts the rational number to its equivalent floating-point value.
7. `abs()`: Returns the absolute value of the rational number.
8. `toString()`: Overrides the `toString()` method to provide a string representation of the rational number.

### RationalNumberOperations Class

#### Methods:
1. `main(String[] args)`: Main method to perform arithmetic operations on rational numbers entered by the user using command line arguments.

---

## Part 2

### Assignment7_Part2 Class

#### Methods:
1. `factorial(int n)`: Calculates the factorial of a given integer `n`.
2. `main(String[] args)`: Main method to calculate factorial of integers provided as command line arguments.

### FactorialException Class

#### Methods:
1. `FactorialException(String message)`: Constructor to create a custom exception for factorial calculation.

---

## Part 3

### NOMATCHEXCP Class

#### Methods:
1. `NOMATCHEXCP(int lineNumber, String erroneousString)`: Constructor to create a custom exception for string matching.

### StringMatchDemo Class

#### Methods:
1. `main(String[] args)`: Main method to check if a string matches the expected value "India" and throws a custom exception if it doesn't.
2. `getLineNumber()`: Utility method to retrieve the line number where the exception occurred.


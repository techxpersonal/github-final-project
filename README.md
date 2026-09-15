# Simple Interest Calculator (Java)

A small Java command-line project that calculates simple interest from a principal amount, annual rate of interest, and time in years.

## Formula

`simple interest = principal × rate × time / 100`

## Requirements

- Java Development Kit (JDK) 17 or later
- Visual Studio Code with the **Extension Pack for Java** (recommended)

## Run it

```powershell
javac -d out src\SimpleInterestCalculator.java
java -cp out SimpleInterestCalculator
```

Enter non-negative numeric values when prompted. The result is displayed to two decimal places.

## Run in Visual Studio Code

1. Open this folder in VS Code.
2. Open `src/SimpleInterestCalculator.java`.
3. Select **Run** above the `main` method, or press `F5`.
4. Type the requested values in the integrated terminal.

## Example

```text
Enter the principal amount: 1000
Enter the annual rate of interest: 5
Enter the time period in years: 2
The simple interest is: 100.00
```

## License

This project is licensed under the Apache License, Version 2.0. See [LICENSE](LICENSE).

## Contributing

Contributions are welcome. Please review [CONTRIBUTING.md](CONTRIBUTING.md) and follow the [Code of Conduct](CODE_OF_CONDUCT.md).

import java.util.Locale;
import java.util.Scanner;

/**
 * Calculates simple interest using: principal × annual rate × time / 100.
 */
public final class SimpleInterestCalculator {
    private SimpleInterestCalculator() {
        // Prevent instantiation of this utility class.
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Simple Interest Calculator ===");

            double principal = readNonNegativeNumber(scanner, "Enter the principal amount: ");
            double annualRate = readNonNegativeNumber(scanner, "Enter the annual rate of interest (%): ");
            double years = readNonNegativeNumber(scanner, "Enter the time period in years: ");

            double simpleInterest = calculateSimpleInterest(principal, annualRate, years);

            System.out.printf("%nThe simple interest is: %.2f%n", simpleInterest);
            System.out.printf("The total amount is: %.2f%n", principal + simpleInterest);
        }
    }

    static double calculateSimpleInterest(double principal, double annualRate, double years) {
        return principal * annualRate * years / 100.0;
    }

    private static double readNonNegativeNumber(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);

            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                if (value >= 0) {
                    return value;
                }
                System.out.println("Please enter a non-negative value.");
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next();
            }
        }
    }
}

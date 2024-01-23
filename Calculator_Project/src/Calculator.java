import java.util.Scanner;

public class Calculator {

    // Method for addition
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method for subtraction
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // Method for multiplication
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Method for division
    public static double divide(int num1, int num2) {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            System.out.println("Cannot divide by zero. Please enter a non-zero divisor.");
            return Double.NaN; // You can choose an appropriate value or handle this case differently.
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Call and print the results of all methods
            System.out.println("Sum: " + add(num1, num2));
            System.out.println("Subtraction: " + subtract(num1, num2));
            System.out.println("Multiplication: " + multiply(num1, num2));
            System.out.println("Division: " + divide(num1, num2));
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } finally {
            scanner.close();
        }
    }
}

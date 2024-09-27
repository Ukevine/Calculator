import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // operations
        System.out.println("Simple Calculator");
        System.out.println("Choose an operation: ");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        
        // user's choice
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        // numbers for the calculation
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform the operation 
        switch (choice) {
            case 1: // Addition
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2: // Subtraction
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3: // Multiplication
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4: // Division
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation.");
        }

        scanner.close();
    }
}

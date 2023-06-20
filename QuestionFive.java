/*
WRITE YOUR COMMENT HERE
 */

import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt for the operation
        System.out.print("Enter the operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Prompt for the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result;

        // Perform the calculation based on the chosen operation
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}

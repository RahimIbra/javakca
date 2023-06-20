/*
WRITE YOUR COMMENT HERE
 */

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for the number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check divisibility by integers in the range of 0-9
        for (int i = 0; i <= 9; i++) {
            if (i == 0) {
                if (number == 0) {
                    System.out.println("The number is divisible by 0 because it is 0.");
                } else if (number % 10 == 0) {
                    System.out.println("The number is divisible by 10 because it ends with a 0 (zero).");
                }
            } else {
                if (number % i == 0) {
                    System.out.println("The number is divisible by " + i + ".");
                }
            }
        }

        // Close the scanner
        scanner.close();
    }
}

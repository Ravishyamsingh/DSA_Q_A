import java.util.Scanner;

/*
 Program Name  : Add_subtract_digit
 Description   : This program calculates the difference between
                 the product of digits and the sum of digits
                 of a given integer number.
 Formula       : Result = (Product of digits) − (Sum of digits)
*/

public class Add_subtract_digit {

    // Main method – execution starts here
    public static void main(String[] args) {

        // Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Store original number for reference
        int originalNumber = number;

        // Variables for calculation
        int product = 1;
        int sum = 0;

        // Loop to process each digit
        while (number > 0) {

            // Extract last digit
            int digit = number % 10;

            // Calculate product of digits
            product = product * digit;

            // Calculate sum of digits
            sum = sum + digit;

            // Remove last digit
            number = number / 10;
        }

        // Final calculation
        int result = product - sum;

        // Output section
        System.out.println("Original Number : " + originalNumber);
        System.out.println("Sum of Digits   : " + sum);
        System.out.println("Product of Digits: " + product);
        System.out.println("Final Result (Product - Sum): " + result);

        // Close scanner
        sc.close();
    }
}

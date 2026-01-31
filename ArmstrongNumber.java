// Simple calculation
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int originalNum = num, sum = 0, digits = 0;

        // Count digits
        if (originalNum == 0) {
            digits = 1; // handle 0 case
        }

        while (originalNum != 0) {
            originalNum /= 10;
            digits++;
        }

        originalNum = num;

        // Armstrong calculation
        while (originalNum != 0) {
            int digit = originalNum % 10;
            sum += Math.pow(digit, digits);
            originalNum /= 10;
        }

        System.out.println("Calculated sum = " + sum);

        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        scanner.close(); // close scanner
    }
}

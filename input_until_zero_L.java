

import java.util.Scanner;

public class input_until_zero_L{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE, num;
        // Create a Scanner object for user input
        // Create a Scanner object for user input

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            
            num = sc.nextInt();
            if (num == 0) break;
            if (num > max) max = num;
        }

        sc.close();
        System.out.println("Largest number: " + (max == Integer.MIN_VALUE ? "No numbers entered" : max));
    }
}


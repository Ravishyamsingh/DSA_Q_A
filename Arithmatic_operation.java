import java.util.Scanner;

public class Arithmatic_operation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter second number: ");
        int num2 = in.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = in.next().charAt(0);

        // Simple calculation
        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            if (num2 != 0) {
                System.out.println(num1 / num2);
            } else {
                System.out.println("Zero division error");
            }
        } else {
            System.out.println("Please enter correct input");
        }

        in.close(); // close scanner
    }
}

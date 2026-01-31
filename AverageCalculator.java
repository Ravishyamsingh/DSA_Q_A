import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the count of numbers: ");
        int n = sc.nextInt();

        // Simple Calculation
        if (n <= 0) {
            System.out.println("Invalid input. Count must be greater than 0.");
            sc.close(); // close scanner before exit
            return;
        }

        double sum = 0;
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            sum += sc.nextDouble();
        }

        double average = sum / n;
        System.out.println("Average: " + average);

        sc.close(); // close scanner
    }
}

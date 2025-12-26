






import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = scanner.nextInt();
        double sum = 0;
        //Marks Average Calculation
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            sum += scanner.nextDouble();
        }

        double average = sum / n;
        System.out.printf("Average Marks: %.2f%n", average);

        scanner.close();
    }
}






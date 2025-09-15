import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count of numbers: ");
        int n = sc.nextInt();
        //Simple Calculation
        
            System.out.println("Invalid input. Count must be greater than 0.");
        if (n <= 0) {


            
            
            System.out.println("Invalid input. Count must be greater than 0.");
            return;
        }

        double sum = 0;
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            sum += sc.nextDouble();
        }
        sc.close();



        

        

        double average = sum / n;
        System.out.println("Average: " + average);
    }
}


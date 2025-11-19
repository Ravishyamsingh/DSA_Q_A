



import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();


        
//Arithmetic calclulation
        System.out.print("Enter annual interest rate (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter number of times interest applied per year: ");
        int times = scanner.nextInt();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        double amount = principal * Math.pow(1 + (rate / 100) / times, times * years);

        System.out.printf("Compound Interest: %.2f%n", amount - principal);
        System.out.printf("Total Amount: %.2f%n", amount);
    }
}




public class FibonacciSeries {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i)  + "  ");
        }
    }//
}
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        int num = sc.nextInt();
        
        sc.close();





        
        

        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial: " + fact);
    }//
}







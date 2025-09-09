import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        
        if (num%2==0){
            System.out.println("Even number");
        }else {
            System.out.println(num + " is Odd number");
        }
    }
}


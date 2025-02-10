import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principle / amount: ");
        double princple = in.nextFloat();
        System.out.println("Enter rate: ");
        double rate = in.nextFloat();
        System.out.println("Enter time: ");
        double time = in.nextFloat();
        double si= (princple*rate*time)/100;

        System.out.println(princple+si);
    }
}

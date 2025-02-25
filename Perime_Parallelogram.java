import java.util.Scanner;

public class Perime_Parallelogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side 1: ");
        double side1=sc.nextDouble();
        System.out.println("Enter the side 2: ");
        double side2=sc.nextDouble();
        double perimeter=2*(side1+side2);
        System.out.println(perimeter);
    }
}

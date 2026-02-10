import java.util.Scanner;

public class VolumePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base base: ");
        double base = sc.nextDouble();
        System.out.print("Enter the base height: ");
        double height = sc.nextDouble();
        double volume =(base*height)/3 ;
        System.out.println("Volume of the prism: " + volume);
    }
}

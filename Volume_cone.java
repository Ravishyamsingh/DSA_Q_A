
import java.util.Scanner;

public class Volume_cone {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        
        double radius = sc.nextDouble();
        System.out.println("Enter the height: ");
        
        double height = sc.nextDouble();
        double perimeter = (Math.PI*radius*radius*height)/3;
        
        System.out.println(perimeter);
    }
}



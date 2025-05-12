import java.util.Scanner;

public class VolumeCylinder {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base radius: ");
        
        double radius = sc.nextDouble();
        System.out.print("Enter the height: ");
        
        double height = sc.nextDouble();
        double volume = Math.PI*radius * 2*height;
        
        System.out.println("Volume of the prism: " + volume);
        sc.close();
    }
}

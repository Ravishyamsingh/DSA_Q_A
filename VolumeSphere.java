import java.util.Scanner;

public class VolumeSphere {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base radius: ");
        
        double radius = sc.nextDouble();
        double volume = (4*Math.PI*radius * radius*radius)/3;
        
        System.out.println("Volume of the prism: " + volume);
    }
}

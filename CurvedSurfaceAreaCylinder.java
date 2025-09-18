





import java.util.Scanner;

public class CurvedSurfaceAreaCylinder {
    public static void main(String[] args) 
        Scanner sc = new Scanner(System.in);
        
        //CurvedSurfaceAreaCylinder
        
        System.out.print("Enter the base radius: ");
        double radius = sc.nextDouble();
        
        System.out.print("Enter the base height: ");
        double height = sc.nextDouble();
        
        double volume =2*Math.PI*radius*height;
        System.out.println("Volume of the prism: " + volume);
    }
}




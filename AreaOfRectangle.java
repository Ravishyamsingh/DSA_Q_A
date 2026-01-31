import java.util.*;

public class AreaOfRectangle {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        double length, width, Arearectangle;

        // Simple Calculation
        System.out.print("Enter the Length: ");
        length = in.nextDouble();

        System.out.print("Enter the Width: ");
        width = in.nextDouble();

        Arearectangle = length * width;
        System.out.println("Area of Rectangle = " + Arearectangle);

        in.close(); // close scanner
    }
}

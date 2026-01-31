import java.util.Scanner;

public class AreaEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double side, Area;

        System.out.print("Enter the side: ");
        side = in.nextDouble();

        // Formula calculation
        Area = (Math.sqrt(3) / 4) * Math.pow(side, 2);   // √3/4 × side²

        System.out.println("Area of Equilateral Triangle = " + Area);

        in.close(); // close scanner
    }
}


import java.util.Scanner;

public class CurvedSurfaceAreaCylinder {

    // Constant for PI (better practice than using Math.PI everywhere)
    private static final double PI = Math.PI;

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Curved Surface Area of a Cylinder ===");

        // Take radius input
        System.out.print("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();

        // Take height input
        System.out.print("Enter the height of the cylinder: ");
        double height = sc.nextDouble();

        // Validate input
        if (radius <= 0 || height <= 0) {
            System.out.println("Radius and height must be positive values.");
        } else {
            // Calculate curved surface area
            double curvedSurfaceArea = calculateCurvedSurfaceArea(radius, height);

            // Display result
            System.out.println("----------------------------------");
            System.out.println("Radius : " + radius);
            System.out.println("Height : " + height);
            System.out.println("Curved Surface Area : " + curvedSurfaceArea);
            System.out.println("----------------------------------");
        }

        // Close scanner
        sc.close();
    }

    // Method to calculate curved surface area of cylinder
    public static double calculateCurvedSurfaceArea(double radius, double height) {
        return 2 * PI * radius * height;
    }
}

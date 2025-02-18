import java.util.Scanner;

public class PerimeterEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double side_length, perimeter;
        System.out.println("Enter the side length: ");
        side_length=in.nextDouble();
        perimeter=3*side_length;
        //Perimeter = 3 × side length (a)

        System.out.println(perimeter);
    }
}

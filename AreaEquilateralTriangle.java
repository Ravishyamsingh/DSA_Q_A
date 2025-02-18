import java.util.Scanner;

public class AreaEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        double side,Area;
        System.out.println("Enter the side: ");
        side=in.nextDouble();
        Area=(Math.sqrt(3)/4)*Math.pow(side, 2);    //√3/4 × (side)²
        System.out.println(Area);

    }
}

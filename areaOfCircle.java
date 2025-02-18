import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius, AreaCircle;
        radius=in.nextDouble();
        AreaCircle= 3.14*radius*radius;
        System.out.println("The area of circle: "+AreaCircle);
    }
}

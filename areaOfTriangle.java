import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        double base,height, AreaTriangle;
        System.out.println("Enter the base: ");
        base=in.nextDouble();
        System.out.println("Enter the Height: ");
        height=in.nextDouble();
        AreaTriangle=(0.5*base*height);  //Area of Triangle=1/2(base*height)
                                         //Area Of Isosceles Triangle
                                         //Area Of Parallelogram
                                        //Area Of Rhombus
                                        //for all formula is same.

        System.out.println(AreaTriangle);
    }
}

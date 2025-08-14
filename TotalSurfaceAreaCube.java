

import java.util.*;
import java.util.Scanner;

public class TotalSurfaceAreaCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base radius: ");
        double radius = sc.nextDouble();
        System.out.print("Enter the base height: ");
        double height = sc.nextDouble();
        
        double volume =2*Math.PI*radius*(radius+height);
        System.out.println("Volume of the prism: " + volume);
    }
}


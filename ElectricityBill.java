


import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        
        int units = sc.nextInt();
        sc.close();
        
// Calculate the bil
        
        double bill = 0;

        
        if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 300) {
            bill = 100 * 1.5 + (units - 100) * 2.5;
        } else {
            bill = 100 * 1.5 + 200 * 2.5 + (units - 300) * 3.5;
        }

        System.out.println("Total Bill: ₹" + bill);
    }
}

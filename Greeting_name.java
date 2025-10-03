
import java.util.Scanner;

public class Greeting_name {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        // Scanner in =  new Scanner 
        //     (System.in)
        System.out.print("Enter name:");
        String name = in.nextLine();
        System.out.println(name +" Happy morning!");
    }
}



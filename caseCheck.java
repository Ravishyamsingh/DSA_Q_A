import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        char ch=in.next().trim().charAt(0);
        
//        String word = "hello";
//        //System.out.println(in.next().trim());
        if (ch>= 'a' && ch <= 'z'){
            System.out.println("Lower latter");
        }else{
            System.out.println("Upper case");
        }



        
        System.out.println();



    }
}

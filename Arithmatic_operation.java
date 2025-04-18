import java.util.Scanner;


public class Arithmatic_operation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        
        System.out.println("Enter operator");
        //Simple calculation
        char operator =in.next().charAt(0);
        if (operator=='+'){
            System.out.println(num1+num2);
        }
        else if(operator=='-'){
            System.out.println(num1-num2);
        }
        else if (operator=='*'){
            System.out.println(num1*num2);

        } else if (operator== '/'){
            if(num2 !=0){
                System.out.println(num1/num2);
            }else{
                System.out.println("Zero division error");
            }
        }else{
            System.out.println("Please enter correct input: ");
        }



    }

}

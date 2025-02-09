import java.util.Scanner;

public class print_large_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1= in.nextInt();
        int num2= in.nextInt();
        int max;
//        if(num1>num2){
//            System.out.println(num1"");
//        }
        int num3 = in.nextInt();
        if (num1 > num2){
            max=num1;
//            System.out.println(max +" is big");
        }else
        {
            max=num2;
//            System.out.println(max);
        }
        if(num3>max){
            max=num3;

        }
        System.out.println(max);
    }
}


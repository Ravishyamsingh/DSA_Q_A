import java.util.Scanner;

public class numtobanarybinarytonum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Convert Number into binary with In-built function

//        int num=sc.nextInt();
//        int binary= Integer.parseInt(((Integer.toBinaryString(num))));
//        System.out.println(binary);
//
//        //Convert binary into Number
//
//        String binarys=sc.next();
//        int nums=Integer.parseInt(binarys, 2);
//        System.out.println(nums);



        //convert number into binary without In-built function
        int number=sc.nextInt();
        int binaryt=0;
        int place=1;
        while(number>0){
            int rem=number%2;
            binaryt=binaryt+(rem*place);
            place=place*10;
            number=number/2;
        }
        System.out.println(binaryt);
    }
}

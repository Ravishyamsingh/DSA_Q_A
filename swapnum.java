package Array_ArrayList;

public class swapnum {
    public static void main(String[] args) {
        int a=5;
        int b=4;
        System.out.println("Before swaping num: "+a+" and "+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" and "+ b);
    }
}

public class swapnumm {
    public static void main(String[] args) {
        int a=5, b=122;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("A = "+a+"\nB = "+b);
        int sum=0;
        while(a>0) {
            int rem = a % 10;
            sum = sum + rem;
            a = a / 10;
           // System.out.println(sum);
        }
        System.out.println(sum);
    }
}

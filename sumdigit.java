package Array_ArrayList;

public class sumdigit {
    public static void main(String[] args) {
        int num=1234;
        int sum=0;

        while(num>0){
            int r=num%10;
            sum=sum+r;
            num=num/10;
        }
        System.out.println(sum);
    }
}

import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        Integer a = sc.nextInt();
        Integer reverse=0;
        while(a!=0){
            int remainder=a%10;
            reverse=reverse*10+remainder;
            a=a/10;
        }
        System.out.println("The reverse of given number is:"+reverse);
    }
}

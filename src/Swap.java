import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        Integer a = sc.nextInt();
        System.out.println("Enter the 2nd number:");
        Integer b = sc.nextInt();
        Integer temp = a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
}

import java.util.*;
public class Prgm5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        Integer a=sc.nextInt();
        if(a%8==0)
        {
            System.out.println("The given number is divisible by 8");
        }
        else{
            System.out.print("The given number is not divisible by 8");
        }

    }
}

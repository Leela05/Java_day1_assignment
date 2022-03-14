import java.util.*;
public class Prgm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        Integer a = sc.nextInt();
        System.out.println("Enter 2nd number:");
        Integer b = sc.nextInt();
        if(a<b){
            System.out.println("a is the smallest");
        }
        else{
            System.out.println("b is the smallest");
        }
    }
}

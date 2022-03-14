import java.util.*;
public class Largestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number");
        Integer a = sc.nextInt();
        System.out.print("Enter the 2nd number");
        Integer b = sc.nextInt();
        System.out.print("Enter the 3rd number");
        Integer c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("A is the largest!");
            }
            else{
                System.out.println("C is largest!");
            }
        }
        else{
            System.out.println("B is the largest");
        }
    }
}

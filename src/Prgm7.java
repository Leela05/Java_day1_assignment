import java.util.*;
public class Prgm7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter year:");
        Integer year = sc.nextInt();
        if(year%4==0 || year%4000==0){
            System.out.println("The given year is leap year!");
        }
        else{
            System.out.println("The given year is not a leap year!");
        }
    }
}

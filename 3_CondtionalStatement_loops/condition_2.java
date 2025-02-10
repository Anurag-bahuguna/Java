import java.util.*;

public class condition_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();
//1 way
        if(num < 0){
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is positive");
        }
        if(num % 2 == 0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}

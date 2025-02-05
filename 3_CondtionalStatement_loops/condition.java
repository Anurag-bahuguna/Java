import java.util.*;

public class condition {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // if (age >= 18) {
        //     System.out.println("You are eligible to vote");
        // } else {
        //     System.out.println("You are not eligible to vote");
        // }
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}

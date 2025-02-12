//WAP to print sum of first n natural numbers using for loop.
import java.util.Scanner;

public class loop_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n =sc.nextInt();

        int s=0;
        for(int i =1;i<=n;i++){
            s=s+i;
        }
        System.out.println(s);
    }
}

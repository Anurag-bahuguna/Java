// WAP to print table of a number n using for loop.

import java.util.*;

public class loop_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number who's table u want: ");

        int n = sc.nextInt();
        for(int i =1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}

// for(int i =1;i<=10;i++){
//     System.out.println("5 * "+i+" = "+5*i);
// }
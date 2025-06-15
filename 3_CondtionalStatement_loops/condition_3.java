import java.util.*;

public class condition_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number a:");
        int a = sc.nextInt();
        System.out.print("enter number b:");
        int b = sc.nextInt();

        if(a==b){
            System.out.println("equal");
        }else if(a<b){
            System.out.println("a is less then b");
        }else {
            System.out.println("a is greater then b");
        }
    }
}

// also write a prog for nasted if
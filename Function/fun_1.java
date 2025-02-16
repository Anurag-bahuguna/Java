import java.util.Scanner;

public class fun_1 {
    // public static void printNmae(String name){        
    //     System.out.println(name);
    //     return;
    // }
    // public static void main(String[] args) {
    //     System.out.println("Enter your name");
    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.nextLine();

    //     printNmae(name);
    // }

    // public static int calculateSum(int a, int b){        
    //     int sum = a+b;
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     // System.out.println("Enter your name");
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     int sum = calculateSum(a, b);
    //     System.out.println(sum);

    // }

    public static int calculateProduct(int a, int b){        
        return a*b;
    }
    public static void main(String[] args) {
        // System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Product is: "+calculateProduct(a, b));

    }
}

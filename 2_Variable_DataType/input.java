import java.util.*;

public class input {
    public static void main(String[] args) {
        //input
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();
        String gender = sc.next();
        int age = sc.nextInt();

        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);

        //taking 2 numbers from user and adding them
        System.out.println("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum =a+b;
        System.out.println("Sum of a and b is: "+sum);



    }
}


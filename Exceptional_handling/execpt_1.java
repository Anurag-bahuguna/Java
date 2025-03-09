package Java.Exceptional_handling;

public class execpt_1 {
    public static void main(String[] args) {
        try{
            int a, b, c;
            a = 10;
            b = 0;

            c= a/b;
            System.out.println("The result is: "+c);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
        System.out.println("The End");
    }
}

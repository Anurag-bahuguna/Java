package Java.Exceptional_handling;

public class execpt_1 {
    public static void main(String[] args) {
        // try{
        //     int a, b, c;
        //     a = 10;
        //     b = 0;

        //     c= a/b;
        //     System.out.println("The result is: "+c);
        // } catch (ArithmeticException e) {
        //     System.out.println("Division by zero is not allowed.");
        // }

    //multiple catch
        try{
            int a, b, c;
            a = 10;
            b = 0;
            c= a/b;

            System.out.println("The result is: "+c);

            int arr[] = new int[2];
            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30;
            arr[3] = 40;

            
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bound.");        
        }
        catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        System.out.println("The End");
}
}

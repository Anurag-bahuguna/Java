package Java.Exceptional_handling;

//Exception handling checked exception bufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class except_2 {
    public static void main(String[] args) {
        try{
            int i,j;
            System.out.println("Enter the value of i and j");
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            i = Integer.parseInt(br.readLine());
            j = Integer.parseInt(br.readLine());
            int k =i+j;
            System.out.println("Sum is "+k);
            
        }
        catch(IOException e){
            System.out.println("Error in input");
        }
        catch(NumberFormatException e){
            System.out.println("Number format exception");
        }
    }
}

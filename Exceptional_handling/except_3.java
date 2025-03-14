package Java.Exceptional_handling;
//exception handling throw keyword
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class except_3 {
    public static void main(String[] args) throws Exception {
        String s = "";
        System.out.println("Enter a string");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        System.out.println(s);
    }
}

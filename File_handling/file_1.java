package Java.File_handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//user input by bufferedReader
public class file_1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(i);
    //or
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        System.out.print("Enter your name: ");
        
        s = br.readLine();
        System.out.println("Input is : " + s);
        
    }
}

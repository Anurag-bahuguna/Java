package Java.File_handling;

import java.io.File;
import java.io.FileOutputStream;    //FileOutputStream is used to write byte in file
import java.io.DataOutputStream;    //DataOutputStream is used to write string in file
//file handling

public class file_2 {
    public static void main(String[] args) throws Exception {
        String s = "Hello, World!";
        String s1 = "anurag";
        File f = new File("Demofile.txt");  //create file

        FileOutputStream fos = new FileOutputStream(f);     
        DataOutputStream dos = new DataOutputStream(fos);
        // dos.write(s.getBytes());    //write() is used to write byte in file but it is readable in file
        dos.writeUTF(s);
        dos.writeUTF(s1);   //writeUTF() is used to write string in file but it is not readable in file
        dos.close();
        fos.close();
        System.out.println("File created successfully");
    }    
}

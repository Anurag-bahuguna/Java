package Java.File_handling;

import java.io.File;
import java.io.FileInputStream;   
import java.io.DataInputStream;   

public class file_3 {
    public static void main(String[] args) throws Exception{
        String s;
        String s1;

        File f = new File("Demofile.txt");

        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        s=dis.readUTF();
        s1=dis.readUTF();
        dis.close();
        fis.close();
        System.out.println("Data read from file is: "+s +" " +s1);
    }
}

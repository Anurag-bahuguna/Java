package Java.File_handling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
//Serialization and Deserialization in Java
//Serialization is a mechanism of converting the state of an object into a byte stream. Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. This mechanism is used to persist the object.
public class file_4 {
    public static void main(String[] args) throws Exception{
        Cricket c = new Cricket();
        c.runs = 50;
        c.batman = "Sachin";
        c.balls = 70;
        File f = new File("Serialfile.txt");
        // FileOutputStream fos = new FileOutputStream(f);
        // ObjectOutputStream oos = new ObjectOutputStream(fos);
        // oos.writeObject(c);
        // oos.close();
        // System.out.println("Object is serialized");
        
        Cricket c1;
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        c1 = (Cricket)ois.readObject();
        ois.close();

        System.out.println("Object is deserialized"+ c1.runs + " " + c1.batman + " " + c1.balls);
    }
}
class Cricket implements Serializable{
    int runs;
    String batman;
    transient int balls;
}

package Java.Java_Collections;

import java.util.Collection;
import java.util.ArrayList;

//Collection is an interface that represents a group of objects, known as its elements.
    //ArrayList is a class that implements the Collection interface.

public class Collection_1 {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        // System.out.println("initial size of collection: " + c.size());
        c.add(5);
        c.add(10);
        c.add(15);

        System.out.println("size of collection: " + c.size());
        // System.out.println("collection: " + c);

        for(Object i : c) {     //for each loop
            System.out.println(i);
        }
    }
}

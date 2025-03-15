package Java.Java_Collections;
import java.util.ArrayList;
import java.util.List;

//List is an interface that extends Collection. It is an ordered collection (also known as a sequence).
    //list is similar to Collection.
    //ArrayList is a class that implements the List interface.
public class list_1 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(5);
        l.add(10);
        l.add(9);
        System.out.println("size of list: " + l.size());
        System.out.println("list: " + l);
        System.out.println("element at index 1: " + l.get(1));

        for(Object i : l) {     //for each loop
            System.out.println(i);
        }
    }
}

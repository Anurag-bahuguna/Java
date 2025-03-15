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

        l.set(1, 15);   //set element at index 1
        System.out.println("list after setting element at index 1: " + l);

        l.remove(2);    //remove element at index 2
        System.out.println("list after removing element at index 2: " + l);
        for(Object i : l) {     //for each loop
            System.out.println(i);
        }

        Object arr[] = l.toArray();     //convert list to array
        for(Object i : arr) {
            System.out.println(i);
        }
    }

    
}

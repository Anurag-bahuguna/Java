package Java.Java_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

//Sorting
public class list_2 {
    public static void main(String[] args) {
        // List<Integer> l = new ArrayList<>();
        // l.add(5);
        // l.add(1);
        // l.add(9);
        
        // Collections.sort(l);
        // System.out.println("list: " + l);

//java collection list sorting using comparator interface        
    //     List<Integer> l = new ArrayList<>();
    //     l.add(5);
    //     l.add(1);
    //     l.add(9);
        
    //     SortNumbers s = new SortNumbers();
    //     Collections.sort(l,s);
        
    //     for(Integer i : l) {
    //         System.out.println(i);
    //     }
    // }

//also use anoanymius 
        List<Integer> l = new ArrayList<>();
        l.add(5);
        l.add(1);
        l.add(9);

        
        // Collections.sort(l,new SortNumbers()); //anonymous Object OR
        Collections.sort(l,new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return a<b?1:a>b?-1:0;
            }
        });
        for(Integer i : l) {
            System.out.println(i);
        }
    }
}

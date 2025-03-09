//array is a collection of similar type of elements that have contiguous memory location.
//array is a reference data type, so it can be created using new keyword and we can also create an array using array literal syntax.

package Java.Arrays;

public class array_1 {
    public static void main(String[] args) {
    //why we use array?
        int a= 1;
        int b= 4;
        int c= 3;
        int d= 7;

//Syntax 1
    //array literal         
        // int x[] = {1,4,3,7}; 
        // System.out.println(x[0]); //print position 0
        // System.out.println(x[1]); //print position 1

        // for(int i = 0; i < 4; i++){     //print all the elements of array
        //     System.out.println(x[i]);
        // }
    
//Syntax 2
    //new keyword
        //because an array is an object in java, we can create an array using new keyword.
        int x[] = new int[4]; //declaration and instantiation
        // x[0] = 4; //initialization
        // x[1] = 7;
        // x[2] = 3;

    //if we want to print 1 to 4 numbers sequentially
        for(int i = 0; i < 4; i++){
            x[i] = i+1;
            System.out.println(x[i]);
        }        
    }
}

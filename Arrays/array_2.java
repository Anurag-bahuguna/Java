package Java.Arrays;

public class array_2 {
    public static void main(String[] args) {
        int arr[] = new int[4];
        for(int i = 0; i < 4; i++){
            arr[i] = i+1;            
        }
        //array using enhanced for loop
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

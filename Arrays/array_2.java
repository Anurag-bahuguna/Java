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


    //2D array
        int k[][] = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                k[i][j] = i+j;
                System.out.print(k[i][j] + " ");
            }
            System.out.println();
        }

        //2D array using enhanced for loop
        int arr2[][] = new int[3][3];
        int x= 1;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                k[i][j] = x++;
            }
        }
        for (int i[] : arr2) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

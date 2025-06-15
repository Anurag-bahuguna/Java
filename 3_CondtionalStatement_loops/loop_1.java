public class loop_1 {
public static void main(String[] args) {
    for(int i=1; i<=10; i++){
        // System.out.println("Hello World");
        System.out.print(i+",");
    }

    int i=0;
    while(i< 11){
        i=i+1;
        System.out.print(i+",");
    }

    int j=0;
    do{
        System.out.print(j+",");
        j=j+1;
    }while(j<11);
}
}
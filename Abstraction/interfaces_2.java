package Java.Abstraction;

interface demo{
    abstract void show();
}


public class interfaces_2 implements demo{
    public void show(){
        System.out.println("heelo");
    }
    public static void main(String[] args) {
        interfaces_2 i =new interfaces_2();
        i.show();
    }
}
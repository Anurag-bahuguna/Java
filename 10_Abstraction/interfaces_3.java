package Java.Abstraction;

interface demo_1{
    void seek();
}

abstract class demo_2{
    abstract void print();
}

public class interfaces_3 extends demo_2  implements demo_1 {
    public void seek(){
        System.out.println("hello");
    }

    void print(){
        System.out.println("hi");
    }
    public static void main(String[] args) {
        interfaces_3 i = new interfaces_3();
        i.seek();
        i.print();
    }
}
package Java.Abstraction;

abstract class demo_1{
    abstract void tell();
}

public class abstraction_2 extends demo_1{
    void tell(){
        System.out.println("hi");
    }
    public static void main(String[] args) {
        abstraction_2 a2 = new abstraction_2();
        a2.tell();
    }

}
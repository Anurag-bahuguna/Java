package Java.Abstraction;

abstract class demo_1{
    void show(){
        System.out.println("hello");
    }
}

class demo_2 extends demo_1{

}

public class abstraction_1{
    public static void main(String[] args) {
        demo_2 d2 = new demo_2();
        d2.show();
    }
}
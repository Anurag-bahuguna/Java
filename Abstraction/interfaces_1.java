package Java.Abstraction;

interface demo{
    abstract void show();
}

class demo_1 implements demo{
    public void show(){
        System.out.println("hi");
    }
}

public class interfaces_1 {
    public static void main(String[] args) {
        demo_1 d1 = new demo_1();
        d1.show();
    }
}
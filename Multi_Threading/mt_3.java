package Java.Multi_Threading;
//Runable interface 
public class mt_3 {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();

        Thread t1 = new Thread(obj);
        t1.start();

        obj1.start();
    }
}

class A implements Runnable{
    public void run(){
        System.out.println("hi");
    }
}
class B extends Thread{
    public void run(){
        System.out.println("hello");
    }
}
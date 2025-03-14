package Java.Multi_Threading;

public class mt_1 {
    public static void main(String[] args) {
        A obj = new A();    //creating instance of class A and B
        B obj1 = new B();   

        obj.start();         //calling show method of class A
        obj1.start();        //calling show method of class B
    }
}

class A extends Thread{
    public void show(){
        for(int i=0; i<4; i++){
        System.out.println("hi");
        try{Thread.sleep(1000);}catch(Exception e){}      //sleep method is used to pause the execution of the thread for a specific amount of time
        }
    }
    public void run(){
        show();
    }
}
class B extends Thread{
    public void show(){
        for(int i=0; i<4; i++){
            System.out.println("hello");
            try{Thread.sleep(1000);}catch(Exception e){}
            }
    }
    public void run(){
        show();
    }
}

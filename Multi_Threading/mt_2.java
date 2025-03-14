package Java.Multi_Threading;

public class mt_2 {
    public static void main(String[] args) throws Exception{
        A obj = new A();    //creating instance of class A and B
        B obj1 = new B();   

        obj.setName("a thread");
        obj1.setName("b thread");

        System.out.println(obj.getPriority());
        obj.setPriority(10);
        // obj.setPriority(Thread.MIN_PRIORITY);  1

        obj.start(); 
        Thread.sleep(500);       
        obj1.start();       
    }
}

class A extends Thread{
    public void show(){
        for(int i=0; i<4; i++){
        System.out.println("hi" + getName());
        try{Thread.sleep(1000);}catch(Exception e){}    
        }
    }
    public void run(){
        show();
    }
}

class B extends Thread{
    public void show(){
        for(int i=0; i<4; i++){
            System.out.println("hello" + getName());
            try{Thread.sleep(1000);}catch(Exception e){}
            }
    }
    public void run(){
        show();
    }
}

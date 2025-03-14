package Java.Multi_Threading;
//MultiThreading Runnable with anonymous class
 
public class mt_5 {
    public static void main(String[] args) throws Exception{
        Thread t1 = new Thread(new Runnable(){        //anonymous inner class for the interface Runnable
            public void run(){
                for(int i=0; i<4; i++){
                    System.out.println("hi");
                    try{Thread.sleep(200);}catch(Exception e){}    
                }
            }
        });    
        t1.start();

        Thread t2 = new Thread(new Runnable(){                  //threads anonymous inner class for the interface Runnable
            public void run(){
                for(int i=0; i<4; i++){
                    System.out.println("hello");
                    try{Thread.sleep(200);}catch(Exception e){}    
                }
            }
        });
        t2.start();

        t1.join();
        t2.join();

        System.out.println("done");
    }
}


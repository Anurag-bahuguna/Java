package Java.Multi_Threading;

public class mt_1 {
    public static void main(String[] args) {
        A obj = new A();    //creating instance of class A and B
        B obj1 = new B();   

        obj.show();         //calling show method of class A
        obj1.show();        //calling show method of class B
    }
}

class A{
    public void show(){
        for(int i=0; i<4; i++){
        System.out.println("hi");
        }
    }
}
class B{
    public void show(){
        for(int i=0; i<4; i++){
            System.out.println("hello");
            }
    }
}

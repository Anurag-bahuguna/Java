package Java.Inheritance;
// single ton class
// single ton class is a class that can have only one object (an instance of the class) at a time.
public class single_ton {
    public static void main(String[] args) {
        A obj = A.getInstance();
        obj.i = 5;
        obj.show();

        // A obj1 = new A();
        // obj1.i = 5;
        // obj1.show();
    }
}

// class A is single ton class
class A{
    int i;
    private static A obj = new A();

    private A(){
        System.out.println("in const A");
    }
    public static A getInstance(){

        return obj;
    }
    public void show(){
        System.out.println("in show A" +i);
    }
}
package Java.Inheritance;

//using super keyword to call the method and variable of superclass
class X{
    int i=1;
    public void show(){
        System.out.println("hi from X");
    }
}
class Y extends X{
    int i=2;
    public void show(){
        super.show();
        System.out.println("hi from Y"+super.i);
    }
}
public class inherit_2 {
    public static void main(String[] args) {
        Y obj = new Y();
        obj.show();
    }
}

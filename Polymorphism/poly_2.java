//Constructor Overloading

package Java.Polymorphism;
class A{
    public A(){
        System.out.println("default Constructor ");
    }

    public A(int i){
        System.out.println("hi from para int");
    }

    public A(float i){
        System.out.println("hi from para float");
    }

    public A(double i){
        System.out.println("hi from para double");
    }
}
public class poly_2 {
    public static void main(String[] args) {
        A obj = new A();
        A obj1 = new A(5.5f);
    }
}

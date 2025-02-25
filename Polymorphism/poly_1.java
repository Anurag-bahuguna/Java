// 1.overloading
// 2.overriding

// 2.overriding and method overriding
package Java.Polymorphism;
class A{
    void show(){
        System.out.println("hello from A");
    }
}
class B extends A{
    void show(int a){
        System.out.println("hello from B");
    }
}
public class poly_1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show(10);
    }
}

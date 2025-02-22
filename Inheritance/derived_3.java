package Java.Inheritance;

class base{
    void display(){
        System.out.println("in base");
    }
}

public class derived_3 extends base{
    void display(){
        System.out.println("in derived");
        super.display();
    }
    public static void main(String[] args) {
        derived_3 d = new derived_3();
        
        d.display();
    }
}

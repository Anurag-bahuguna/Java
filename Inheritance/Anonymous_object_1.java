//anonymous object is an object that has no reference. It is used to call the methods of a class.

package Java.Inheritance;

class AB{
    public AB(){
        System.out.println("in constructor");
    }
    public void show(){            //instance method
        System.out.println("Hello");
    }

    int i ; //instance variable
    // static int j; //static variable
    public void display(){
        System.out.println(i);
    }
}

public class Anonymous_object_1 {

    public static void main(String[] args) {

        // AB obj(referance) = new AB()(object creation);  //tihs is referance object

    // anonymous object
        new AB().show();        // it is an anonymous object,but it is call only once
        new Anonymous_object_1().display();

        new AB().i = 5;
        new AB().display();    // it will print 0 because it is a new object
    }

    void display() {
        System.out.println("Namaste");
    }
}

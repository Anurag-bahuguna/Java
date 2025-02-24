//anonymous object is an object that has no reference. It is used to call the methods of a class.

package Java.Inheritance;

class AB{
    void show(){
        System.out.println("Hello");
    }
}

public class Anonymous_object {

    public static void main(String[] args) {

        // AB obj(referance) = new AB()(object creation);

        // anonymous object
        new AB().show();
        new Anonymous_object().display();
    }

    void display() {
        System.out.println("Namaste");
    }
}
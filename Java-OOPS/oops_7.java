// abstraction 

abstract class animal{
    abstract void walk();
    public void eat(){
        System.out.println("Animal is eating");
    }

    animal(){
        System.out.println("u r creating a new Animal ");
    }//constructor chaining 
}

class dog extends animal{
    public void walk(){
        System.out.println("Dog is walking on 4 legs");
    }

    dog(){
        System.out.println("u r creating a new Dog ");
    }
}

class bird extends animal{
    public void walk(){
        System.out.println("Bird is walking on 2 legs");
    }
}
public class oops_7 {
    public static void main(String[] args) {
        dog d = new dog();
        d.walk();
        d.eat();

        animal a = new animal(); // this will give an runtime error as animal is abstract class
        a.walk();
    }

}

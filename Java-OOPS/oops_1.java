// class and object
class pen{
    String color;
    String type;

    void write(){
        System.out.println("Writing something");
    }

    void printColor(){    //way 2 method to print
        System.out.println(this.color);
    }    
}

public class oops_1 {
    public static void main(String[] args) {
        pen p1 = new pen();         // p1 is an object of class pen, it is class name pen type variable and pen() is constructor
        pen p2 = new pen();

        p1.color = "blue";          //to access the variable of class pen, we use
        p1.type = "ball";
        // System.out.println(p1.color);    //way 1 to print property

        p1.write();
        p1.printColor();

        p2.color = "red";
        p2.type = "gel";
        p2.printColor();
    }
}

//constructor and its types
    //constructor is a special type of method that is used to initialize the object.

class student{
    String name;
    int age;

    student(){              //default constructor or non-parameterized constructor
        System.out.println("Constructor called");
    }

    public void printInfo(){             
        System.out.println(this.name);    
        System.out.println(this.age);
        
    }
}

public class oops_2 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "John";
        s1.age = 20;
        s1.printInfo();
    }
}

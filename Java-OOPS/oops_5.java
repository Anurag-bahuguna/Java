// Polymorphism
    // There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism.
    // but first we will see compile-time polymorphism. because run time polymorphism is based on inheritance and inheritance is the next topic.

//function overloading is an example of compile-time polymorphism.

class student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name+ " "+ age);
    }
}
public class oops_5 {
    public static void main(String[] args) {
        student s1 = new student();
        // s1.printInfo("aman");
        // s1.printInfo(20);
        // s1.printInfo("aman", 20);
        s1.name = "aman";
        s1.age = 20;

        s1.printInfo(s1.name);
        s1.printInfo(s1.name,s1.age);
    }
}

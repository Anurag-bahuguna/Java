//copy constructor in java

class student{
    String name;
    int age;

    student(){}         //we have to also define a default constructor,because we dont have a default constructor

    student(student s2){              //copy constructor
        this.name = s2.name;                        
        this.age = s2.age;
    }

    public void printInfo(){             
        System.out.println(this.name);    
        System.out.println(this.age);
        
    }
}

public class oops_4 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "aman";
        s1.age = 20;
        s1.printInfo();

        student s2 = new student(s1);
        s2.printInfo();

    }
}

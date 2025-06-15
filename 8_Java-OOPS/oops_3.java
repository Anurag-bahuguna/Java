class student{
    String name;
    int age;

    student(String name , int age){              //parameterized constructor
        this.name = name;                        //initialization 
        this.age = age;
    }

    public void printInfo(){             
        System.out.println(this.name);    
        System.out.println(this.age);
        
    }
}

public class oops_3 {
    public static void main(String[] args) {
        student s1 = new student("aman", 20);
        s1.printInfo();
    }
}

package Java.Inheritance;



class parent{
    void show(){
        System.out.println("in parent");
    }
}

class child extends parent{
    void display(){
        System.out.println("in child");
        super.show();
    }
    public class inner extends child{
        void tell(){
            System.out.println("in inner class");
            super.display();
        }
    }
}

class derived_4 {
    public static void main(String[] agrs){
        child c = new child();
        c.display();
        child.inner i = c.new inner();
        i.tell();
    }
}
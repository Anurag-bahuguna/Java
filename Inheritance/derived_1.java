package Java.Inheritance;

class base {
    base(){
        System.out.println("in base");
    }    
}

class derived_1 extends base{
    derived_1(){
        System.out.println("in derived");
    }
    public static void main(String[] agrs){
        derived_1 d= new derived_1();
    }
}
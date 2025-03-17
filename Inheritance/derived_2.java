package Java.Inheritance;

class base {
    base(int x){
        int num;
        num=x;
        System.out.println("in base");
        System.out.println(num);
    }    
}

class derived_2 extends base{
    derived_2(){
        super(10);
        System.out.println("in derived");
    }
    public static void main(String[] agrs){
        derived_2 d= new derived_2();
    }
}

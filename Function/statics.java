class demo{
    // non static function
    void add(){
        System.out.println("add fun");
    }
    // static function
    static void sub(){
        System.out.println("sub fun");
    }
}

public class statics {

    public void multi(){
        System.out.println("multi fun");
    }

    static int a;   //static variable
    public  static void div(){
        a = 20;      //so static function can access static variable only
        System.out.println("div fun");
    }

    public static void main(String[] args) {
    
        
        demo s = new demo();

        s.add();    // to call non static function
        demo.sub(); // to call static function

        statics s1 = new statics();

        s1.multi();
        statics.div();
    }

    
}

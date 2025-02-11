public class statics {
    // non static function
    void add(){
        System.out.println("add fun");
    }
    // static function
    static void sub(){
        System.out.println("sub fun");
    }

    public static void main(String[] args) {
    
    // why it error
        // public void multi(){
        //     System.out.println("multi fun");
        // }

        // public  static void div(){
        //     System.out.println("div fun");
        // }
        statics s = new statics();
        // statics s1 = new statics();

        s.add();
        sub();
        // s1.multi();
    }

    
}

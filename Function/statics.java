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
        statics s = new statics();
        s.add();
        sub();
    }
}

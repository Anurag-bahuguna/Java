public class relation_2op {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // System.out.println(a > b); // false
        // System.out.println(a < b); // true
        // System.out.println(a >= b); // false
        // System.out.println(a <= b); // true
        // System.out.println(a == b); // false
        // System.out.println(a != b); // true 
        
        System.out.println(a<b); //true
        if(a<b){
            System.out.println("true");
        }

        boolean c = a<b; //true
        System.out.println(c);
    }
}

public class conditional_3op {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        
        if(a<8 && b<8){     //AND
            System.out.println("hello");
        }else{
            System.out.println("bye");
        }

        if(a<5 || b<8){     //OR
            System.out.println("hello");
        }else{
            System.out.println("bye");
        }

        // Ternary operator
        int min = (a<b)?a:b;
        System.out.println(min);

        String i = (a<b)?"true":"false";
        System.out.println(i);
        
        // urinary operator
        
    }    
}

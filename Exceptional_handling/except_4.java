package Java.Exceptional_handling;

public class except_4 {
    public static void main(String[] args) throws MyException {
        // try{
        //     int a,b,c;
        //     a = 5;
        //     b = 4;
        //     c = a/b;
        //     if(c ==1){          // generating an exception by ourself
        //         throw new ArithmeticException("ans can't be 1");
        //     }else{
        //         System.out.println("valid ans"+c);
        //     }
        //     System.out.println(c);
        // }catch(ArithmeticException e){
        //     System.out.println(e);
        // }

//user define exception
        try{
            int a,b,c;
            a = 5;
            b = 4;
            c = a/b;
            if(c ==1){          // generating an user define exception 
                throw new MyException("ans can't be 1");    //here MyException is a class which is user define exception,we have to create this class
            }         
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }

    static class MyException extends Exception{
        public MyException(){

        }
        public MyException(String s){
            super(s);
        }
    
        
    }
}

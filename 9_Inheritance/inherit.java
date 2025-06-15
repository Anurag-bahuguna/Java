package Java.Inheritance;
//java obj creation of superclass using subclass obj
// class X{
//     public X(){
//         System.out.println("in const X");
//     }
//     public void show(){
//         System.out.println("in show X");
//     }
// }

// class Y extends X{
//     public Y(){
//         System.out.println("in const Y");
//     }
//     public Y(int i){
//         System.out.println("in const Y para int");
//     }
// }
// public class inherit {
//     public static void main(String[] args) {
//         X obj = new Y(5);
//         obj.show();

//     }
// }

//java obj creation of subclass using superclass obj also use super keyword
class X{
    public X(){
        System.out.println("in const X");
    }
    public X(int i){
        System.out.println("in const x para int");
    }
}

class Y extends X{
    public Y(){
        System.out.println("in const Y");
    }
    public Y(int i){
        super(i);           //super keyword is used to call the constructor of the superclass
        System.out.println("in const Y para int");
    }
}
public class inherit {
    public static void main(String[] args) {
        Y obj = new Y(5);
        

    }
}
//Inheritance in Java
    //4 types .multiple inheritance is not supported in java , but we can achieve this by using interface.

// class shape{
//     String color;
// }

// class tringle extends shape{

// }

// public class oops_6 {
//     public static void main(String[] args) {
//         tringle t1 = new tringle();
//         t1.color = "red";
//         System.out.println(t1.color);
//     }
// }

//1. Single Inheritance
// class shape{
//     public void area(){
//         System.out.println("display area");
//     }
// }

// class tringle extends shape{
//     public void area(int l,int h){
//         System.out.println(0.5*l*h);
//     }
// }

// public class oops_6 {
//     public static void main(String[] args) {
//         tringle t1 = new tringle();
        
//         t1.area(10, 20);
//         t1.area();
//     }
// }


//2. Multilevel Inheritance

class shape{
    public void area(){
        System.out.println("display area");
    }
}

class tringle extends shape{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
}

class equi_tringle extends tringle{
    public void area(){
        System.out.println("display result area of tringle1");
    }
}

public class oops_6 {
    public static void main(String[] args) {
        tringle t1 = new tringle();
        // check it again
        t1.area(10, 20);
        t1.area();
        
    }
}

package Java.Inheritance;

//in java every class extends a object and when we try to print this object,
//ToString 
public class toStr {
    public static void main(String[] args) {
        A obj = new A();
        obj.i = 4;
        obj.sname = "mohit";

        System.out.println(obj.toString());
    }
}

class A{
    int i;
    String sname;

    public String toString(){
        return (i+":"+sname);
    }
}
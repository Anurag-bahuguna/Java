//static keyword in java

class student{
    String name;
    static String collage;

    public static void changeCollage(){
        collage = "amity";
    }
}
public class oops_8 {
    public static void main(String[] args) {
        student.collage =  "jims";      //in static variable we can access it without creating object

        student s1 = new student();
        s1.name = "Rahul";
        System.out.println(s1.collage);
    }
}

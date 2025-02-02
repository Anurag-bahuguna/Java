package Java.string;

public class Basic_Methods {
    public static void main(String[] args){
        // String Declaration
        String str = "Hello World";
        System.out.println(str);

//String Methods
    // String Length
        System.out.println("Length of the string: " + str.length());

    //case
        String name = "Anurag";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

    //Finding a Character
        String passage = "learning Java is fun";
        System.out.println(passage.indexOf("fun"));
        System.out.println(passage.charAt(9));
    //Concatenation
        String firstName= "Anurag";
        String lastName= "Bahuguna";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

    //Substring
        String text = "Hello World";
        System.out.println(text.substring(6));
        System.out.println(text.substring(0, 5));
    

    //nubers in string
        String x = "10";
        int y = 20;
        System.out.println(x+y);
        
    }
}
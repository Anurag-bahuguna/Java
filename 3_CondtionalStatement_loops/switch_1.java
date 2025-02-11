import java.util.*;

public class switch_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("what u want to say 1.namaste 2.hola 3.bonjour:");
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("namaste");
                break;
            case 2:
                System.out.println("hola");
                break;
            case 3:
                System.out.println("bonjour");
                break;
            default:
                System.out.println("invalid input");
        }
    }
}

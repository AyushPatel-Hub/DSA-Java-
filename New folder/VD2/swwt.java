
import java.util.Scanner;

public class swwt {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1 : System.err.println("Hello");
        break;
        case 2 : System.out.println("Namstee");
        break;
        case 3 : System.err.println("Bonjour");
        break;
        default:System.err.println("Invalid");
        }
    }
}

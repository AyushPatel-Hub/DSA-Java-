
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the Value of A-");
        int a = sc.nextInt();
        System.err.println("Enter the value of B-");
        int b = sc.nextInt();
        System.err.println("Types of opperation -");
        System.err.println( "Addition-1");
        System.err.println( "Subtraction-2");
        System.err.println( "Multiplication-3");
        System.err.println("Remainder-4");
        int c= sc.nextInt();
        int sum = a+b;
        int Subtraction = a-b;
        int Multiplication = a*b;
        int Remainder = a%b;
        switch(c){
            case 1: System.err.println(sum);
            break;
            case 2: System.err.println(Subtraction);
            break;
            case 3 : System.err.println(Multiplication);
            break;
            case 4 : System.err.println(Remainder);
            break;
            default:System.err.println("Type inbetween the given Range");
        }
    

    }
}
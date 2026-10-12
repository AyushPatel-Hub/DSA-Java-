
import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        System.err.println("Enter A -");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.err.println("Enter B-");
        int b = sc.nextInt();
        if(a==b){
            System.err.println("Equal");
        }
        else if (a>b) {
            System.err.println("A is greater than B");
            
        }
        else{
            System.err.println("B is greater than A");
        }

        }
    }


import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        System.err.println("Enter the Number-");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.err.println("Number is Even");
        }
        else{
            System.err.println("Number is Odd");
        }
    }
}

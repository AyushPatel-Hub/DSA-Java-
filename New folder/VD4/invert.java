
import java.util.Scanner;

public class invert{
    public static void main(String[] args) {
        System.err.print("Enter the number-");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for( int i = a ; i>=1 ; i--){
            for (int j = 1; j<=i ; j++){
                System.err.print("*");
            }
            System.err.println();
        }
    }
}
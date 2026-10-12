
import java.util.Scanner;

public class halfpyramid{
    public static void main(String[] args) {
        System.err.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for( int i = 1; i<=a ; i++){
            for (int j = 1; j<=i ; j++){
                System.err.print("*");
            }
            System.err.println();
        }
    }
}
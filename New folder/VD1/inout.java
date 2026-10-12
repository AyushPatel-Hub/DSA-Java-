import java.util.Scanner;

public class inout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the value of A-");
        int a = sc.nextInt();
        System.err.println("Enter the Value of B-");
        int b = sc.nextInt();
        int sum = a+b ;
        System.err.println("The sum is " + sum);
    }
}

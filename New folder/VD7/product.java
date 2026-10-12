import java.util.Scanner;

public class product {
    public static int productOfNumbers(int a , int b) {
        int multiplication= a*b;
        return multiplication;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int multiplication=productOfNumbers(a, b);
        System.out.println(multiplication);
    }
}


import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.err.println("Enter the value of n-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i =1; i<=n ; i++){
            sum = sum + i;
        }
        System.err.println(sum);
    }
}

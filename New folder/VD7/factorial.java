import java.util.Scanner;

public class factorial{
    public static void factorialOfNumber(int n){
        int factorials=1;
        for(int i=n;i>=1;i--){
            
            factorials=factorials*i;
        }
        System.out.println(factorials);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factorialOfNumber(n);
    }
}
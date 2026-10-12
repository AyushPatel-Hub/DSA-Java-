import java.util.Scanner;

public class sum {
    public static int sumOfNumbers(int a, int b) {
        
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter Two Number-");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum= sumOfNumbers(a, b);
        System.out.println(sum);
    }
    
    
    
}

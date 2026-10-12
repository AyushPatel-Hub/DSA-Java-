import java.util.Scanner;

public class one{
    public static void main(String[] args) {
        System.out.println("Enter the Numbers-");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int Average=(a+b+c)/3;
        System.out.println(Average);

    }
}
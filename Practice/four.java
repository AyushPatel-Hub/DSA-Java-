import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius-");
        double r =sc.nextDouble();
        double circumferences;
          circumferences=2*(3.14)*r;
        System.out.println(circumferences);
    }
}

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        System.err.println("Enter Your Age");
        Scanner sc= new Scanner(System.in);
        int Age = sc.nextInt();
        if(Age>18){
            System.out.println("You are Adult");
        }
        else{
            System.err.println("Grow up kid");
        }
    }
}

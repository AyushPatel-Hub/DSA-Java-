import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        System.out.println("Enter the Age-");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>18){
            System.out.println("Eligible"); 
        }
        else{
            System.out.println("not Eligible");
        }
        
    }
}

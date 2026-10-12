
import java.util.Scanner;

public class array{
    public static void main(String[] args) {
        int numbers[]=new int[5];
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of Array-");
        int size =sc.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("Enter the Numbers-");
            numbers[i]=sc.nextInt();
        }
    //    numbers[0]=1;
    //    numbers[1]=2;
    //    numbers[2]=3;
    //    numbers[3]=4;
    //    numbers[4]=5;
    System.out.println("The Array is-");
       for(int i=0;i<size;i++){
        System.out.print(numbers[i]+ " ");
       }
       System.out.println();
    }
}
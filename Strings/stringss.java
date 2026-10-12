import java.util.Scanner;

public class stringss{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence- ");
        String name=sc.nextLine();
        // for(int i=0;i<name.length();i++){
        //     System.out.println(name.charAt(i));
        // }
        int Namelength= name.length();
        System.out.println( "Total length of the String is " + Namelength);

         

    }
}
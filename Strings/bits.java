import java.util.Scanner;

public class bits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number-");
        int n= sc.nextInt();
        System.out.println("Enter the Position-");
        int pos=sc.nextInt();
        int bitMask=n<<pos;
        // if( (bitMask & n)==0){
        //     System.out.println("The Bit was 0");

        // } else{
        //     System.out.println("The bit was 1");
        // }
        int notbitMask=~(bitMask);
        int newnumber= notbitMask & n;
        System.out.println(newnumber);
    }
}

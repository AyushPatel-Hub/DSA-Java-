package DAY_8_BIT_MANIPULATION;

public class evenodd{
    public static void main(String[] args) {
        int n=-2;
        if((n&1)==1){
            System.out.println(n+" "+"IS ODD ");
        }else{
            System.out.println(n+" "+"IS EVEN");
        }
    }

}
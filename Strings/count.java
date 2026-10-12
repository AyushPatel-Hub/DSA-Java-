public class count{
    public static void main(String[] args) {
        int n= 5;
        int pos=2;
        int bitMask=n<<pos;
        for(int i=0;i<n;i++){
            if(bitMask==1){
                System.out.println("1");
            }else{
                System.out.println(" ");
            }
        }
    }
}
public class pattern2 {
    public static void main(String[] args) {
        int n=4;
        int m=5;
        for(int i=1;i<=4;i++){
            for(int j=1 ; j<=5;j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.err.print("*");
                } else{
                    System.err.print(" ");
                }
                
            }
            System.out.println();
        }
        
    }
    
}

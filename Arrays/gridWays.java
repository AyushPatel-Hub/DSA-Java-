public class gridWays {
    public static int gridWaysmethod(int i,int j,int n,int m){
        //base case
        if(i==n-1 && j==m-1){ // lastr cell condtion
            return 1;
        }else if(i==n || j==m){ // boundary condition
            return 0;
            
        }
        int ways1=gridWaysmethod(i+1,j,n,m);
        int ways2=gridWaysmethod(i,j+1,n,m);
        int totalWays=ways1+ways2;
        return totalWays;
    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
      System.out.println(  gridWaysmethod(0, 0, n,m));
    }
}

public class Mazemove {
    public static int Movemaze(int i,int j,int n,int m){
        if(i>=n || j>=m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        int down=Movemaze(i+1, j, n, m);
        int right=Movemaze(i, j+1, n, m);
        return down+right;
    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        System.out.println(Movemaze(0, 0, n, m));
    }
}

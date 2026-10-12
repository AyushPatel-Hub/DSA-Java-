public class tiles {
    public static int printtiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int horizontal=printtiles(n-1, m);
        int vertical=printtiles(n-m, m);
        return horizontal+vertical;
    }
    public static void main(String[] args) {
        int n=4;
        int m=3;
        int ans=printtiles(n, m);
        System.out.println(ans);
    }
}

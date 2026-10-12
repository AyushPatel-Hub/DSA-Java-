package DAY_10_Recursion;

public class question2{
    public static int xtoPowern(int x,int n){
        if(x==1 || n==0){
            return 1;
        }
        return x*xtoPowern(x, n-1);
    }
    public static int optimizedPower(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpowerSq= optimizedPower(x, n/2);
        int finalSq=halfpowerSq*halfpowerSq;

        if(n%2!=0){
            finalSq=x*finalSq;
        }
        return finalSq;
    }
    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 201));
    }
}
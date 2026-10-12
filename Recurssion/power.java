public class power {
    public static int Calcpower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int Pwr1=Calcpower(x, n-1);
        int pwr=x*Pwr1;
        return pwr;

    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans= Calcpower(x, n);
        System.out.println(ans);
    }
}

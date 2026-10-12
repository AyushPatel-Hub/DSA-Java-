public class FACTORIAL{
    public static int CalcFact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int Fact_nm1=CalcFact(n-1);
        int Fact_n=n*Fact_nm1;
        return Fact_n;
    }
    public static void main(String[] args) {
        int n=5;
        int ans=CalcFact(n);
        System.err.println(ans);
    }
}
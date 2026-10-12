public class invite {
    public static int Callguest(int n){
        if(n<=1){
            return 1;
        }
        // to call single
        int ways1=Callguest(n-1);
        //call in pairs
        int ways2=Callguest(n-2)*(n-1);
        return ways1+ways2;
    }
    public static void main(String[] args) {
        int n=4;
        int ans=Callguest(n);
        System.out.println(ans);
    }
}

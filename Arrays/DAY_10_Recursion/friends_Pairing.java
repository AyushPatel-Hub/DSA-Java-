package DAY_10_Recursion;

public class friends_Pairing {
    public static int pairingWays(int n){
        if(n==1 || n==2){
            return n;
        }
        int singleWays=pairingWays(n-1);
        int pairs=pairingWays(n-2);
        int pairWays=(n-1)*pairs;
        return singleWays+pairWays ;
    }

    public static void main(String[] args) {
        System.out.println(pairingWays(3 ));
    }
}

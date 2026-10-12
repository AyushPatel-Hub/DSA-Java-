package DAY_8_BIT_MANIPULATION;

public class getithbit {
    public static int getIthBit(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
           return 0;
        }
        return 1;
    }
     public static int setIthBit(int n,int i){
        int bitmask=1<<i;
        return n | bitmask;
     }
     public static int clearIthBit(int n,int i){
        int bitmask=1<<i;
        return (n & ~bitmask);
    }
    public static int updateIthBit(int n,int i,int set){
        int bitmask=1<<i;
        if(set==1){
            return n | bitmask;
        }
        return n & ~bitmask;
    }
    public static int clearLastBit(int n,int i){
        int bitmask=-1<<i;
        return n & bitmask;
    }
    public static int clearRangeBits(int n,int i,int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        return (a|b)&n;
    }
    public static boolean isPowerOfTwo(int n){
        if((n&(n-1))==0){
            return true;
        }
        return false;
    }
    public static int countSetBit(int n){
        int bitmask=1;
        int count=0;
        while(n>0){
            if((n&bitmask)!=0){
                count++;
                n=n>>1;
            }else{
                n=n>>1;
            }
        }
        return count;
    }
    public static int fastExp(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){ //Checks LSB here it is 1
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(3));
    }
}

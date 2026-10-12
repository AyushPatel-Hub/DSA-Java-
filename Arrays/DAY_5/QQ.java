package DAY_5;

public class QQ {

    public static int IndexOfNumber(int num[],int target){
        for(int i =0;i<num.length;i++){
            if(num[i]==target){
                return i;
            } 
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8};
        int target=10;
        int ans=IndexOfNumber(num, target);
        System.out.println(ans);
    }
}

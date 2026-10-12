package DAY_5;

public class QQQQ {
    public static int TrappedRainWater(int height[]){
        int leftMaxArray[]=new int[height.length];
           leftMaxArray[0]=height[0];
           for(int i=1;i<leftMaxArray.length;i++){
            leftMaxArray[i]=Math.max(leftMaxArray[i-1],height[i]);
           }
           int rightMaxArray[]=new int[height.length];
           rightMaxArray[height.length-1]=height[height.length-1];
           for(int j=height.length-2;j>=0;j--){
            rightMaxArray[j]=Math.max(height[j],rightMaxArray[j+1]);
           }

           int trappedwater=0;
           for(int i=0;i<height.length;i++){
            int waterHeight=Math.min(rightMaxArray[i],leftMaxArray[i]);
            trappedwater+=waterHeight-height[i];
           }

           return trappedwater;


    }
    public static void main(String[] args) {
        int height[]={4, 2, 0, 3, 2, 5};
        int ans=TrappedRainWater(height);
        System.out.println(ans);
    }
}

public class rainwater{
    public static int trappedrainwater(int height[]){
        int n=height.length;
        // calculate left max boundary in form of array
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        // calculate right max boundary in form of array
        int rightmax[]=new int[height.length];
        rightmax[n-1]=height[n-1];
        for(int j=n-2;j>=0;j--){
            rightmax[j]=Math.max(height[j],rightmax[j+1]);

        }
        int trappedrainwater=0;
        //loop
        for(int i=0;i<n;i++ ){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trappedrainwater+=waterlevel-height[i];
        }
        return trappedrainwater;
    } 
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        int ans=trappedrainwater(height);
        System.out.println(ans);
    }
}
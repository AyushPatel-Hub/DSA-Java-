public class new12{
    public  static int maxArea(int[] height) {
        int n=height.length;
        int maxheight=0;
        for(int i=0;i<n;i++){
             maxheight=Math.max(height[i],maxheight);
             
        }
        // return maxheight; 
        
           int water=0;
           int dis=0;
        for(int i=0;i<height.length;i++){
            
            if(maxheight-height[i]==1 || height[i]-maxheight==1){
                 dis=Math.min(maxheight,height[i]);
                 System.out.println(dis);
            }
            water=dis*dis;
    
        }
      return water; 
        
    }
    public static void main(String[] args) {
        int height[]={1,1};
       int ans= maxArea(height);
       System.out.println(ans);
    }
    
}
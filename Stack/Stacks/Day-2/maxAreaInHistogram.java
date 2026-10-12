import java.util.Stack;

public class maxAreaInHistogram {
    public static int maxArea(int height[]){
        int maxArea=0;
        int n=height.length;
        int nsr[]=new int[n];
        int nsl[]=new int[n];
        //Next smaller in right
        Stack<Integer> s=new Stack<>();
        for(int i=height.length-1;i>=0;i--){
            while(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                    nsr[i]=height.length;
            }else{
                 nsr[i]=s.peek();
            }
            s.push(i);
        }
        //Next smaller left
        s=new Stack<>();
         for(int i=0;i<height.length;i++){
            while(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                    nsl[i]=-1;
            }else{
                 nsl[i]=s.peek();
            } 
            s.push(i);
        }

        //current area
        for(int i=0;i<height.length;i++){
            int Height=height[i];
            int width=nsr[i]-nsl[i]-1;
            int area=Height*width;
            maxArea=Math.max(maxArea, area);

        }
        return maxArea;
    }
    public static void main(String[] args) {
        int height[]={2,4};
        System.out.println(maxArea(height));
    }
}

package Day_1;

import java.util.ArrayList;

public class Conatainer {
    public static int  mostWater(ArrayList<Integer> height){
        int maxWater=0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int heights=Math.min(height.get(i),height.get(j));
                int width=j-i;
                 int water=heights*width;
                 maxWater=Math.max(water,maxWater);

            }
        }
        return maxWater;
    }

    public static int twoPointer(ArrayList<Integer> height){
        int maxWater=0;
        int i=0;
        int j=height.size()-1;
        while(i<j){
            int ht=Math.min(height.get(j),height.get(i));
            int width=j-1;
            int water=ht*width;
            maxWater=Math.max(maxWater, water);
            if(height.get(i)<height.get(j)){
                i++;
            }else{
                j--;
            }

        }
        return maxWater;
    }
    public static void main(String[] args) {
       ArrayList<Integer> height=new ArrayList<>();
       height.add(1);
       height.add(8);
       height.add(6);
       height.add(2);
       height.add(5);
       height.add(4);
       height.add(8);
       height.add(3);
       height.add(7);
        System.out.println(mostWater(height));
        System.out.println(twoPointer(height));
    }
    
}

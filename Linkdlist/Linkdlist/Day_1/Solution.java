package Day_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static List<Integer> findMissingElements(int[] nums) {
        // int max=Integer.MIN_VALUE;
        // int min=Integer.MAX_VALUE;
       List<Integer> list = new ArrayList<>();
              Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int current = nums[i];
            int next=nums[i+1];
            for(int j=current+1;j<next;j++){
                list.add(j);
            }
        }

        return list;

    }
    public static void main(String[] args) {
        int nums[]={5,1};
        findMissingElements(nums);
    }
}
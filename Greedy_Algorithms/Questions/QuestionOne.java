package Greedy_Algorithms.Questions;

public class QuestionOne {
    public static void main(String[] args) {
        int nums1[]={1,2};
        int nums2[]={3,4};
        int i=0,j=0,k=0;
        int merged[]=new int[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                merged[k]=nums1[i];
                i++;
            }else{
                merged[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<nums1.length){
           merged[k]=nums1[i];
                i++;
                k++; 
        }
        while(j<nums2.length){
            merged[k]=nums2[j];
                j++;
                k++;
        }
        for(int a=0;a<merged.length;a++){
            System.out.print(merged[a]+ " ");
        }
        System.out.println();
    }
}

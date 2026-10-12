package DAY_6_2D_Array.questions;

public class two {
    public static int sum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==1){
                    sum+=matrix[1][j];
                }
            }

        }
        return sum;
    }
    public static void main(String[] args) {
         int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
         int ans=sum(nums);
         System.out.println(ans);
    }
}

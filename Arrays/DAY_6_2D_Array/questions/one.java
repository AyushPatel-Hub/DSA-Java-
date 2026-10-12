package DAY_6_2D_Array.questions;

public class one {
    public static int countOfSeven(int matrix[][]){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==8){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
         int[][] array = { {4,7,8},{8,8,7} };
         int ans=countOfSeven(array);
         System.out.println(ans);
    }
}

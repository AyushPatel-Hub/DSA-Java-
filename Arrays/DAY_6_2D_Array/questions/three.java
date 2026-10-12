package DAY_6_2D_Array.questions;

public class three {
    public static void transposeArray(int matrix[][]){
        int row=matrix.length;
        int col=matrix[0].length;
        int transpose[][]=new int[row][col];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(transpose[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
         transposeArray(nums);
    }
}

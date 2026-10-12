package DAY_6_2D_Array;

import java.util.Scanner;

public class TwoDArray {

    public static boolean Search(int Matrix[][],int key){
        
         for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[0].length;j++){
                if(Matrix[i][j]==key){
                    System.out.println("Key found at ("+ i+ ","+j+")");
                    return true;
                }
            }
            
        }
        System.out.println("NOT FOUND");
        return false;
         
    }
    public static int largestNumber(int matrix [][]){
        int largest=Integer.MIN_VALUE;
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>largest){
                    largest=matrix[i][j];
                } 
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int Matrix[][]=new int [3][3];
        int n=3,m=3;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                Matrix[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print( Matrix[i][j]+" ");
            }
            System.err.println();
        }
      int ans= largestNumber(Matrix);
        System.out.println(ans);
    }
}

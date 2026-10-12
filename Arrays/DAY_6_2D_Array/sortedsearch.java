package DAY_6_2D_Array;

public class sortedsearch {
    public static boolean stairCaseSearch(int matrix[][], int key){

        // this was for when we start from top left most part
    //     int row=0, col=matrix[0].length-1;
    //     while(row<matrix.length && col>=0){
    //         if(key==matrix[row][col]){
    //             System.out.print("Found key at ("+row+" "+col+")");
    //             return true;
    //         } else if(key<matrix[row][col]){
    //             col--;
    //         }else{
    //             row++;
    //         }
    //     }
    //     System.out.println("Key not found");
    //     return false;
    // this is for bottom right part starting
    int row=matrix.length-1;
    int col=0;
    while(row>=0 && col<matrix[0].length){
        if(key==matrix[row][col]){
                System.out.print("Found key at ("+row+" "+col+")");
                return true;
            } else if(key<matrix[row][col]){
                row--;
            }else{
                col++;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    
    public static void main(String[] args) {
         int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
         int key=10;
         stairCaseSearch(matrix, key);
    }
}

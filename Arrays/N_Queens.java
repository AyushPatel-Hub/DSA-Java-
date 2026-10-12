public class N_Queens {
    public static void nQueens(char board[][],int row){
        //base case
        if(row==board.length){
            // printBoard(board);
            count++;
            return;
        }
        for(int i=0;i<board.length;i++){
           if(isSafe(board,row,i)){
             board[row][i]='Q';
            nQueens(board, row+1);
            board[row][i]='.';
           }
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("------ChessBoard------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static int count=0;
    
    public static boolean isSafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
        if(board[i][col]=='Q'){ 
            return false;
        }
    }
    //diagonal up left
    for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
        if(board[i][j]=='Q'){
            return false; 
        }
    }
    //vertical right up
    for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
        if(board[i][j]=='Q'){
            return false;
        }
    }
    return true;
     }
    public static void main(String[] args) {
        int n=5;
        char board[][]=new char[n][n];
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';

            }
        }
        nQueens(board,0);
        System.err.println("Total Ways= "+ count);
    }
}

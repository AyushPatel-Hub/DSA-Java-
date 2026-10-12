package DAY_10_Recursion;

public class tilingProblem {
    public static int tilingProblems(int n){
        if(n==0 || n==1){
            return 1;
        }
        int verticalTiles=tilingProblems(n-1);
        int horizontalTiles=tilingProblems(n-2);
        int totalWays=horizontalTiles+verticalTiles;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblems(4));
    }
}

public class part1{
    public static void PrintNumber(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        PrintNumber(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        PrintNumber(n);
    }
}
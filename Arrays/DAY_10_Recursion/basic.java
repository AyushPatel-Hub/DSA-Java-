package DAY_10_Recursion;

public class basic {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fact = n*factorial(n-1);
        return fact;
    }
    public static void printDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print (n+ " ");
        printDec(n-1);
    }
    public static void printNum(int n){
        if(n==1){
            System.out.print(n+ " ");
            return ;
        }
        printNum(n-1);
        System.out.print(n + " ");
    }
    public static int PrintSum(int n){
        if (n==1){
            return 1;
        }
        int sum= n+ PrintSum(n-1);
        return sum;
    }
    public static int fibonacciNumber(int n){
        if(n==0 || n==1){
            return n;
        }
       
        int sum= fibonacciNumber(n-1) + fibonacciNumber(n-2);
        return sum;

    } public static boolean isSOrted(int arr[],int i){
         if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
       
        return isSOrted(arr, i+1);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,4,6};
      System.out.println( isSOrted(arr,0));
    }
    
}

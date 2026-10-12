package DAY_20_BackTracking;

public class onArrays {
    public static void bakcArrays(int arr[],int i,int value){
        int length=arr.length-1;
        while(i<=length){
            arr[i]=value;;
            i++;
            value++;
        }
        for(int j=0;j<=length;j++){
            System.out.print(arr[j]);
        }
        System.out.println();
    }
    public static void changeArray(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            printArr(arr);
            return;
        }


        //recusrion
        arr[i]=val; // kaam
        changeArray(arr, i+1, val+1); //fnc call
        arr[i]=arr[i]-2; // backtracking step
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int[5];

        changeArray(arr, 0,1);
        printArr(arr);
    }
}

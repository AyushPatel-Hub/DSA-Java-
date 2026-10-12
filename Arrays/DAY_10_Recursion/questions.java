package DAY_10_Recursion;

public class questions{
    public static int firstOccurenece(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurenece(arr, key, i+1);
    }
    public static int lastOccurenece(int arr[],int key,int i){
        if(i==0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastOccurenece(arr, key, i-1);
    }
    public static int lastalter(int arr[],int key,int i){
        
    }
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,3,2,1,5};
       System.out.println(lastOccurenece(arr, 5 , arr.length-1));
    }
}
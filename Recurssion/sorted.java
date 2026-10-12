public class sorted {
    public static boolean sorted(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return sorted(arr, idx+1);
        } else{
            return false;
        }

    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,4};
        System.out.println(sorted(arr, 0));sorted(arr, 0);
    }
}

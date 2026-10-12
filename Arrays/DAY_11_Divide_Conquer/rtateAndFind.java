package DAY_11_Divide_Conquer;

public class rtateAndFind {
    public static int RotataeAndFind(int arr[],int target,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        //Case 1
        if(arr[mid]==target){
            return mid;
        }
        // ON line1 
        if(arr[si]<=arr[mid]){
            //case a:
            if(arr[si]<=target && target<=arr[mid]){
               return RotataeAndFind(arr,target,si,mid-1);
            }else{
               return RotataeAndFind(arr,target,mid+1,ei);
            }
        } else{
            //case c:
            if(arr[mid]<=target && arr[ei]>=target){
            return RotataeAndFind(arr,target,mid+1,ei);
            }else{
               return RotataeAndFind(arr,target,si,mid-1);
            }

            }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(RotataeAndFind(arr,target,0,arr.length-1));
    }
}

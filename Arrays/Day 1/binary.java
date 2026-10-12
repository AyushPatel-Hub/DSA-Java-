public class binary{
    public static int binarySearch(int numbers[],int key){
        int start=0;
        int last=(numbers.length)-1;
        while(start<=last){
            for(int i=0;i<numbers.length;i++){
            int mid=(start+last)/2;
            if(numbers[mid]==key){
                return mid;
            } if(numbers[mid]>key){
                last=mid-1;
                
            } else{
                start=mid+1;
            }
        }
    }
     return -1;   }
        


    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6};
        int key=5;
        int idx=binarySearch(numbers, key);
        System.out.println(idx);
        
    }

}
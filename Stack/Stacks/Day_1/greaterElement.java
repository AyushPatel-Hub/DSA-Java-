import java.util.Stack;

public class greaterElement {
    public static void bruteForce(int arr[],int result[]){
        for(int i=0;i<arr.length;i++){
            int nextGreater=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    nextGreater=arr[j];
                    break;
                }
            }
            result[i]=nextGreater;
        }
    }
    public static void nextGreater(int arr[],int[] result){
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                result[i]=-1;
            }else{
                result[i]=s.peek();
            }
            s.push(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,1,7,6,2,0};
        int result[]=new int[arr.length];
        nextGreater(arr, result);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+ " ");
        }
        System.out.println();
    }
}

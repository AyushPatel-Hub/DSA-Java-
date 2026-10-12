public class largest{
    public static int findLargest(int numbers[]){
        int num=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>num){
                num=numbers[i];
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int numbers[]={-1,2,3,4,-5};
       int max=findLargest(numbers);
        System.out.println(max);
        
    }
}
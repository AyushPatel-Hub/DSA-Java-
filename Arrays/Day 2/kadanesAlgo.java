public class kadanesAlgo {

    public static void maxSumAlgo(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int min=numbers[0];
       
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<0){
                if(numbers[i]<min){
                    min=numbers[i];
                }
            }
        }
        System.out.println(min);
        for(int i=0;i<numbers.length;i++){
            currsum+=numbers[i];
            if(currsum<0){
                currsum=0;
            }
            if(maxsum<currsum){
                maxsum=currsum;
            }
            
        }
        
        System.out.println(maxsum);
    }
    public static void MaxSumAlgo1(int numbers[]){
        int currsum=numbers[0];
        int maxsum=numbers[0];

       
        for(int i=1;i<numbers.length;i++){
            currsum=Math.max(numbers[i],currsum+numbers[i]);

            if(currsum>maxsum){
                maxsum=currsum;
            }
        }
        System.out.println("MaxSum is:" + maxsum);
    }
    public static void main(String[] args) {
        int numbers[]={-1,-2,-3};
        MaxSumAlgo1(numbers);
    }
}

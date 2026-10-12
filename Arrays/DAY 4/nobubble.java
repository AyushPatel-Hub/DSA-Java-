public class nobubble{

    public static int[] Sort(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                if(numbers[i]<numbers[j]){
                    int temp=numbers[j];
                    numbers[j]=numbers[i];
                    numbers[i]=temp;
                }
            }
            
        }
      return numbers;

    }
    public static void main(String[] args) {
        int numbers[]={3, 3, 2, 1, 4};
        int ans[]=Sort(numbers);
       for(int i=0;i<numbers.length;i++){
        System.out.print(ans[i] +" ");
       }

    }
}
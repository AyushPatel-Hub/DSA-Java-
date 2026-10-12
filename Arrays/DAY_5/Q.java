package DAY_5;
public class Q{

    public static void Duplicate(int num[]){
      int count=0;
        for(int i=1;i<num.length;i++){
              
            if(num[i-1]==num[i]){
                count++;
            } 
        }
        if(count >0){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }
        

    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        Duplicate(num);
    }
}
package Day_1;

import java.util.ArrayList;

public class pairSum2 {
    public static boolean pairSumTwo(ArrayList<Integer> list,int target){
        int bp=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int n=list.size();
        int j=bp;
        int i=bp+1;
        while(i!=j){
            int sum=list.get(i)+list.get(j);
            if(sum==target){
                System.out.println(list.get(i)+" " +" "+list.get(j));
                return true;
            }
            if(sum>target){
                j=(n+j-1)%n;
            }else{
                i=(i+1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
          ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairSumTwo(list, 16));
    }
}

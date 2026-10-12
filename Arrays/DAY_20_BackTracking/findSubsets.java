package DAY_20_BackTracking;

public class findSubsets {
    public static void findSubsetsSS(String str,String ans,int i){
        //base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }



        //recursion
        //Yes Choice
        findSubsetsSS(str, ans+str.charAt(i), i+1);
        //No choice
        findSubsetsSS(str, ans, i+1);
    }
      public static void main(String[] args) {
        String str="abc";
        String ans="";
        findSubsetsSS(str, ans, 0);
        
    }
}

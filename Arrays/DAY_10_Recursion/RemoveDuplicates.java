package DAY_10_Recursion;

public class RemoveDuplicates {
    public static void removeDuplicates(String str, int idx,StringBuilder SB,boolean map[]){
        if(idx==str.length()){
            System.out.println(SB);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicates(str, idx+1, SB, map);
        }else{
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, SB.append(currChar), map);
        }

    }
    public static void main(String[] args) {
        String str="appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}

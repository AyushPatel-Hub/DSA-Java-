import java.util.HashSet;

public class uniquesub {
    public static void Subseq(String str, int idx,String newString,HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            } else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char current=str.charAt(idx);
        Subseq(str, idx+1, newString+current,set); //to be called
        Subseq(str, idx+1, newString,set); // not to be called+
    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set= new HashSet<>();
        Subseq(str, 0, "",set);
    }
}

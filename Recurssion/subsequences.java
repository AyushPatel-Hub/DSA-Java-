public class subsequences {
    public static void Subseq(String str, int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char current=str.charAt(idx);
        Subseq(str, idx+1, newString+current); //to be called
        Subseq(str, idx+1, newString); // not to be called+
    }
    public static void main(String[] args) {
        String str="abc";
        Subseq(str, 0, "");
    }
}

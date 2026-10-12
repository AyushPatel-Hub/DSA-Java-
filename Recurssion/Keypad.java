public class Keypad {
    public static String Keypad[]={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void KepadPrint(String str, int idx, String Combination){
        if(idx==str.length()){
            System.out.println(Combination);
            return;
        }
        char current= str.charAt(idx);
        String Mapping=Keypad[current-'0'];
        for(int i=0;i<Mapping.length();i++){
            KepadPrint(str, idx+1, Combination+Mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="23";
        KepadPrint(str, 0, "");
    }
}

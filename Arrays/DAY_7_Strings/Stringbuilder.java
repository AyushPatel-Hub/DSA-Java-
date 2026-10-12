package DAY_7_Strings;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        // time complexity=O(26) kyoki 26 baar chala hai ye loop
        System.out.println(sb);
    }
}

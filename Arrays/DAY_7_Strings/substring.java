package DAY_7_Strings;

public class substring {
    public static String subString(String str, int si,int ei){
        String sb="";
        for(int i=si;i<ei;i++){
            sb+=str.charAt(i);
        }
        return sb;
    }
    public static void main(String[] args) {
        String str="HelloWorld";
        // System.out.println(subString(str, 0, 5));
        System.out.println(str.substring(0,5));
    }
}

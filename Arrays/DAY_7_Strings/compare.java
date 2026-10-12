package DAY_7_Strings;

public class compare {
    public static boolean compareString(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;

        }
        for(int i=0;i<str1.length();i++){
            if(str1.toLowerCase().charAt(i)!=str2.toLowerCase().charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="Tony";
        String str2="TONY";
        String str3=new String ("Tony");
        System.out.println(compareString(str, str3));
    }
}

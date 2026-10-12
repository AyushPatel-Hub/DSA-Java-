package DAY_7_Strings;

import java.util.Scanner;

public class Strings {
    public static boolean palindromeCheck(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                System.out.println("Not a Palnidrome");
                return false;
            }
        }
        System.out.println("String is a Palindrome");
        return true;
    }
    public static void main(String[] args) {

            String str="racbvecar";
        // char arr[]={'a','b'};
        // String str="abcd";
        // Scanner sc=new Scanner(System.in);
        // String name;
        // name=sc.nextLine();
        // System.err.println(name);
        palindromeCheck(str);
        
    }
}

import java.util.Stack;

public class reverseString{
    public static String reverseS(String s){
        if(s.length()==0){
            System.out.println("String is empty");
            return s;
        }
        Stack<Character> string=new Stack<>();
        for(int i=0;i<s.length();i++){
            string.push(s.charAt(i));
        }
        StringBuilder result=new StringBuilder();

        while(!string.isEmpty()){
            char curr=string.pop();
            result.append(curr);
        }
        s=result.toString();
        return s;
    }
    public static void main(String[] args) {
        String s= "ayushPatel";
        String result=reverseS(s);
        System.out.println(result);
    }
}
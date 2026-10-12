
import java.util.LinkedList;
import java.util.Queue;

public class nonRepeating {

    public static void checkFirst(String str){
        Queue<Character> q=new LinkedList<>();
        StringBuilder st=new StringBuilder("");
        int freq[]=new int[26];
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            q.add(curr);
            freq[curr-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
              q.remove();
            }
            if(q.isEmpty()){
                st.append("-1");
                // System.out.print(-1+" ");
            }else{
                st.append(q.peek());
                // System.out.println(q.peek()+" ");
            }
        }
        System.out.println(st.toString());
        // System.out.println();
    }
    public static void main(String[] args) {
        String str="aabccxb";
        checkFirst(str);
    }
}

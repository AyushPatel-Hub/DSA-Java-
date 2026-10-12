import java.util.LinkedList;
import java.util.Stack;



public class practice {
    public static boolean palindrome(LinkedList<Integer> list1){
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
       
        while(!list1.isEmpty()){
            int val=list1.remove();
            s1.push(val);
        }
        for(int i=0;i<s1.size();i++){
            int data=s1.get(i);
            s2.push(data);
        }
        return s1.equals(s2);
    }
    public static void main(String[] args) {
        LinkedList<Integer> list1=new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(1);
        System.out.println(palindrome(list1));
    }
}

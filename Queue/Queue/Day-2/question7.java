
import java.util.Deque;
import java.util.LinkedList;

public class question7 {
     static class Stack{
        Deque<Integer> deque=new LinkedList<>();

        public void push(int data){
            deque.addLast(data);
        }
        public int pop(){
            return deque.removeLast();
        }
        public int peek(){
            return deque.getLast();
        }
    }
    static class Queue{
        Deque<Integer> deque1=new LinkedList<>();

        public void add(int data){
            deque1.addLast(data);
        }
        public int remove(){
            return deque1.removeFirst();
        }
        public int peek(){
            return deque1.getFirst(); 
        }
    }
    public static void main(String[] args) {
     Stack s1=new Stack();
       s1.push(1);
       s1.push(2);
       s1.push(3);
        System.out.println(s1.pop());
    }
}


import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reversingK {

        public static void reversingK(Queue<Integer> q,int k){
            Queue<Integer> q1=new LinkedList<>();
            Deque<Integer> deque=new LinkedList<>();
            while(!q.isEmpty()){
                deque.addLast(q.remove());
            }
            for(int i=0;i<k;i++){
                q1.add(deque.removeFirst());
            }
            for(int i=0;i<k;i++){
                deque.addFirst(q1.remove());
            }
            System.out.println(deque);


        }
        public static void optimizedReverse(Queue<Integer> q,int k){
            if(q==null || k<=0 || k>q.size()){
                return;
            }
            Stack<Integer> s1=new Stack<>();
            for(int i=0;i<k;i++){
                s1.push(q.poll());
            }
            while(!s1.isEmpty()){
                q.add(s1.pop());
            }

            int size=q.size();
            for(int i=0;i<size-k;i++){
                q.add(q.poll());
            }
            System.out.println(q);
        }

    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        reversingK(q, 5);
        // optimizedReverse(q, 5);
    }
}

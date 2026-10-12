import java.util.Deque;
import java.util.LinkedList;

public class deque {
    
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(3);
        deque.addLast(4);
        deque.removeFirst();
        System.out.println(deque);
    }
}

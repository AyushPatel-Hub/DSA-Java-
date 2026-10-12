
import java.util.LinkedList;
import java.util.Queue;

public class interLeaveTwoHalves {

    public static void half(Queue<Integer> q){
        Queue<Integer> first=new LinkedList<>();
        Queue<Integer> result=new LinkedList<>();
        int size=q.size();
        // System.out.println(size);
        for(int i=0;i<size/2;i++){
            int curr=q.remove();
            first.add(curr);
        }
        while(!q.isEmpty() && !first.isEmpty()){
            
            int c2=first.remove();
            q.add(c2);
            int c1=q.remove();
            q.add(c1);
        }
        while(!q.isEmpty()){
            System.out.print(q.remove()+ " ");
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        half(q);
    }
}

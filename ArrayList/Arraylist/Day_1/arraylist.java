
package Day_1;
import java.util.*;


public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        
        // System.out.println(list);
        // int element=list.get(2);
        // System.out.println(element);
        // list.set(2,10);
        // System.out.println(list);

        list.add(5);
        list.add(6);
        list.add(7);
        // for(int i=0;i<list.size();i++){
        //     System.err.println(list.get(i));
        // }

        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }
    }
}

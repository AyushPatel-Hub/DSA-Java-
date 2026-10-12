package Day_3;

public class Intersection {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size=0;

    public Node intersection(Node headA,Node headB){
       while(headB!=null){
        Node temp=headA;
        while(temp!=null){
            if(temp==headB){
                return headB;
            }
            temp=temp.next;
        }
        headB=headB.next;
       }
       return null;
    }
    public static void main(String[] args) {
        
Node head1, head2;
head1 = new Node(10);
head2 = new Node(3);
    }
}

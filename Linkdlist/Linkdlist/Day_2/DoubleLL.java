package Day_2;

public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;

        }
    }
    public static Node head;
    public static Node tail;
    public static int size=0;
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;

    }
    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int removeFirst(){
        if(head==null){
            return -1;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
         
    }
    public void addLast(int data){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node last=temp;
        Node newNode=new Node(data);
        size++;
        last.next=newNode;
        newNode.prev=last;
    }
    public int removeLast(){
        if(head==null){
            return -1;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        Node prev=head;
        Node temp=head.next;
        while(temp.next!=null){
            prev=prev.next;
            temp=temp.next;
        }
        Node secondlast=prev;
        int val=temp.data;
        secondlast.next=null;
        temp.prev=null;
        return val;
    }
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;       
        }
        head=prev;
    }
    public static void main(String[] args) {
        DoubleLL dll=new DoubleLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.printList();
        dll.removeFirst();
        dll.printList();
        dll.addLast(10);
        dll.printList();
        // System.out.println(dll.size);
        // int data=dll.removeLast();
        // dll.printList();
        // System.out.println(data);
        dll.reverse();
        dll.printList();
         
    }
}

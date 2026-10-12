
public class Loop{
    public static class Node{
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
    public static boolean isLoop(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        
        newNode.next=head; //link
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;

        }
        tail.next=newNode;
        tail=newNode;
    }
    public static void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
     
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void removeLoop(){
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
               cycle=true;
               break;
            }
        }
       if(cycle==false){
        return;
       }

       slow=head;
       Node prev=null;
       while(slow!=fast){
        slow=slow.next;
        prev=fast;
        fast=fast.next;
       }
       prev.next=null;
    }
    public static void main(String[] args) {
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        System.out.println(isLoop());
        removeLoop();
        System.out.println(isLoop());
    }
}
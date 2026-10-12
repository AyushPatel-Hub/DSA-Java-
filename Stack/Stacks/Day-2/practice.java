public class practice {
    public static  class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        
    }
    public static Node head;
        public static int size=0;

    public static void deleteNM(Node head,int n,int m){
        if(head==null){
            return;
        }
        Node temp=head,t;
        while(temp!=null){
            for(int i=1;i<m && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            return;
        }
        t=temp.next;
        for(int j=1;j<=n&&t!=null;j++){
            t=t.next;
        }
        if(t==null){
            return;
        }
        temp.next=t;
        temp=t;
        }

    }
    static void printList( Node head){
Node temp = head;
while (temp != null){
System.out.printf("%d ", temp.data);
temp = temp.next;
}
System.out.printf("\n");
}
static Node push( Node head_ref, int new_data){
Node new_node = new Node(new_data);
new_node.data = new_data; new_node.next
= (head_ref);
(head_ref) = new_node;
return head_ref;
}

    public static void main(String[] args) {
        Node head = null;
int M=2, N=3;
head=push(head, 10);
head=push(head, 9);
head=push(head, 8);
head=push(head, 7);
head=push(head, 6);
head=push(head, 5);
head=push(head, 4);
head=push(head, 3);
head=push(head, 2);
head=push(head, 1);
System.out.printf("M = %d, N = %d \n" +
"Linked list we have is :\n", M, N);
printList(head);
deleteNM(head, M, N);
System.out.printf("\nLinked list on deletion is :\n");
printList(head);
    }
}

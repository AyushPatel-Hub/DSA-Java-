package Day_2;

// import Day_1.LinkedList;

public class mergeSort{
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
    public static  int size=0;
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
    public void printList(){
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
    public void addMiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        // i=idx-1;temp->prev
        newNode.next=temp.next;
        temp.next=newNode; 
    }
    public void listSize(){
        if(head==null){
            System.out.println("Null");
            return;
        }
        Node temp=head;
        int i=0;
        while(temp!=null){
            temp=temp.next;
            i++;
        }
        System.out.println(i);
    }
    public int removeFirst(){
        if(size==0){
         System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--; 
        return val;
    } public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return -1;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;  //tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val; 
    }
    public int keySearch(int key){
        if(size==0){
            return 0;
        } else if(size==1){
            if(head.data==key){
                return 1;
            }else{
                return -1;
            }
        }
        Node temp=head; 
        int idx=0;
        while(temp!=null){
            if(temp.data==key){
                return idx;
            }else{
                temp=temp.next;
                idx++;
            }
        }
        return -1;
    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);  
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recursiveSearch(int key){
        return helper(head,key);
    }
   public void reverse(){
    Node prev=null;
    Node curr=tail=head;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
   }
   public void deleteNthFromEnd(int n){
    int sz=0;
    Node temp =head;
    while(temp!=null){
        temp=temp.next;
        sz++;
    }
    if(sz==n){
        head=head.next;
        return;
    }
    int i=1;
    int idx=sz-n;
    Node prev=head;
    while(i<idx){
        prev=prev.next;
        i++;
    }
    prev.next=prev.next.next;
    return;
   } 
   //slow-fast approach 
   public Node findMiddle(Node head){
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
   }
   public boolean isPalindrome(){
    if(head==null || head.next==null){
        return true;
    }
      // to fing mid
    Node midNode=findMiddle(head);
//reverse second half
    Node prev=null;
    Node curr=midNode;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
 // check half 
    Node right=prev;
    Node left=head;

    while(right!=null){
        if(left.data!=right.data){
            return false;
        }
        left=left.next;
        right=right.next;
    }
    return true;
   }
   public boolean isLoop(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==head){
                return true;
            }
        }
        return false;
    }
    public  Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }
    public Node merge(Node left,Node right){
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;
        while(left!=null && right!=null){
            if(left.data<=right.data){
                temp.next=left;
                left=left.next;
                temp=temp.next;
            }else{
                temp.next=right;
                right=right.next;
                temp=temp.next;
            }
        }
        while(left!=null){
            temp.next=left;
                left=left.next;
                temp=temp.next;
        }    
        while(right!=null){
            temp.next=right;
                right=right.next;
                temp=temp.next;
        }
        return mergeLL.next;
    }
    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node mid=getMid(head);
        Node rightHead=mid.next;
        mid.next=null;
       Node newLeft= mergeSort(head);
        Node newRight=mergeSort(rightHead);
        return merge(newLeft,newRight);

    }  
    public void zigZag(){
        // find middle
        Node mid=getMid(head);
        //reverse second half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
//zig-zag join
        Node leftHead=head;
        Node rightHead=prev;
        Node nextL,nextR;
        while(leftHead!=null && rightHead!=null){
            nextL=leftHead.next;
            leftHead.next=rightHead;
            nextR=rightHead.next;
            rightHead.next=nextL;
            rightHead=nextR;
            leftHead=nextL;
        }
        
    }
    
    public static void main(String[] args) { 
        mergeSort ll =new mergeSort();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        // ll.head=ll.mergeSort(ll.head);
        ll.printList();
        ll.zigZag();
        ll.printList();
    }
}
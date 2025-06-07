public class linkedlist {
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
    public static int size;

    public void addFirst(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head= newNode;
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
    public void print(){
        if(head==null){
            System.out.println("LL is empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data +" ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx,int data){
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;

        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            return val;

        }
        int val=head.data;
        head=head.next;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        Node prev= head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=tail.data;
        prev.next=null;
        tail=prev;
        return val;
    }
    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
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
    public void deleteNthnodeFromEnd(int n){
        // calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public Node findMidNode(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        // base case 
        if(head==null && head.next==null){
            return true;
        }
        // find mid
        Node midNode=findMidNode(head);
        // reverse 2nd half 
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        // check left half = right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true; //cycle exists
            }
        }
        return false; //cycle does not exist
    }
    private Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow; // mid node
    }
    private Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;

        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedLL.next;
    }
    public Node mergeSort(Node head){
        //base case 
        if(head==null || head.next==null){
            return head;
        }
        //find mid
        Node mid=getMid(head);
        //divide the ll
        Node righthead=mid.next;
        mid.next=null;
        Node newLeft= mergeSort(head);
        Node newRight=mergeSort(righthead);
        //merge the ll
        return merge(newLeft,newRight);
    }
    public void ZigZag(){
        //find mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        //reverse 2nd half
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
        //ALternate merging

        Node LH=head;
        Node RH=prev;
        Node nextL, nextR;

        while(LH!=null && RH!=null){
            nextL=LH.next;
            LH.next=RH;
            nextR=RH.next;
            RH.next=nextL;

            LH=nextL;
            RH=nextR;
        }

    }
    public static void main(String[] args) {
        linkedlist ll =new linkedlist();
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);

        // ll.removeFirst();
        // ll.print();
        // System.out.println();

        // ll.removeLast();
        // ll.print();
        // System.out.println();
        // System.out.println(ll.size);

        // System.out.println(ll.recSearch(2));
        // System.out.println(ll.recSearch(10));
        // ll.deleteNthnodeFromEnd(3);
        // ll.print();
        // System.out.println();
        // System.out.println(ll.checkPalindrome());
        // head=new Node(1);
        // head.next=new Node(2);
        // head.next.next=new Node(3);
        // head.next.next.next=head;
        // System.out.println(isCycle());
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        // ll.print();
        // ll.head=ll.mergeSort(ll.head);
        // ll.print();
        ll.print();
        ll.ZigZag();
        ll.print();
    

    }
    
    
}

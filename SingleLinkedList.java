
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }

}
class SingleLL{

    

    public  void displaySLL(Node head){
        int c=0;
        while(head!=null){
            c++;
            System.out.println(head.data);
            head=head.next;
        }
        System.out.println(c);
    }
    public Node addEnd(Node head,int d){
        Node e = new Node(d);
        
        if(head==null){
            return e;
        }
        Node cuNode=head;
        while(cuNode.next!=null){
            cuNode=cuNode.next;
        }
        cuNode.next=e;
        return head;

        
    }
    public  Node addFirst(Node head, int d){
        Node q = new Node(d);
        if(head == null){
            return q;
        }
        q.next=head;
        return q;
        
        
    }
    public  Node addMiddle(Node head,int pos,Node r){

        if(head==null){
            return r;
        } 
        Node cn = head;
        for(int i=1;i<pos-1;i++){
            cn=cn.next;
        }       
        r.next=cn.next;
        cn.next=r;
        return head;
    }
    //public Node delFirstNode()

}




public class SingleLinkedList extends SingleLL {

        public static void main(String[] args) {
            SingleLL link=new SingleLL();
            Node a = new Node(1);
            Node b = new Node(2);
            Node c = new Node(3);
            Node d = new Node(4);
            a.next=b;
            b.next=c;
            c.next=d;
            //Node f = new Node(0);
            //a=addEnd(a, 0);
            //a= addFirst(a,9);
            Node k = new Node(5);
            a=link.addMiddle(a, 2, k);
            link.displaySLL(a);
}
}
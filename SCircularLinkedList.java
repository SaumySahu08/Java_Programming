
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
    }
}

class SCLinked{

    Node head =null;
    Node tail = null;

    public void createCLL(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ho many numbers linkedlist");
        int n= sc.nextInt();
        if (n<=0) {
            return;
            
        }
        
        System.out.println("Enter data");
        int k = sc.nextInt();
        Node d = new Node(k);
        
        
        head=d;
        Node cNode=head;
        for(int i=1;i<n;i++){
            System.out.println("Enter data");
            int j= sc.nextInt();
            Node q = new Node(j);
            cNode.next=q;
            cNode=cNode.next;
            if(i==n-1){
                q.next=head;
                tail = q;
            }


        }
        

        

    }
    public void displaySCLL(){
        int c=0;
        Node cNode=head;
        while (cNode.next!=head) {
            System.out.println(cNode.data);
            cNode=cNode.next;
            c++;
            
        }
        System.out.println(cNode.data);
        c++;
        System.out.println("count = "+c);
    }

    public void addFirst(int d){

        Node a = new Node(d);
        if(head==null){
            head=a;
            tail=a;
            return;
        }
        a.next=head;
        head=a;


    }
    public void addEnd(int d){
        Node n = new Node(d);

        if(head==null){
            head = n;
            tail=n;
            return;

        }
        Node cNode=head;
        while (cNode.next!=null) {

            cNode=cNode.next;
            
        }
        cNode.next=n;
        tail=n;


    }

    public void addMiddle(int d,int p){

        Node n = new Node(d);
        if(head == null){
            head=n;
            return;
        }
        Node cNode=head;
        for(int i=1;i<p-1;i++){

            cNode=cNode.next;

        }
        n.next=cNode.next;
        cNode.next=n;


    }

    public void delete(int p){
        if(head==null){
            System.out.println("Linkedlist is empty");
            
        }

        else if(p==1){
            head=head.next;
            
            System.out.println("deleted");
        }
        else{
            Node cNode = head;
            //int c=0;
            for(int i=1;i<p-1;i++){
                cNode=cNode.next;
                               
                               
                
            }
            
            cNode.next=cNode.next.next;
            System.out.println("deleted");
        }

    }
    



}








public class SCircularLinkedList {

    public static void main(String[] args) {
        SCLinked lc = new SCLinked();
        lc.createCLL();
       lc.delete(3);
        lc.displaySCLL();
    }
    
}

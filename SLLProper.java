import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
    }
}

class SLinked{

    Node head =null;

    public void createLL(){
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


        }

    }
    public void displaySLL(){
        int c=0;
        Node cNode=head;
        while (cNode!=null) {
            System.out.println(cNode.data);
            cNode=cNode.next;
            c++;
            
        }
        System.out.println("count = "+c);
    }

    public void addFirst(int d){

        Node a = new Node(d);
        if(head==null){
            head=a;
            return;
        }
        a.next=head;
        head=a;


    }
    public void addEnd(int d){
        Node n = new Node(d);

        if(head==null){
            head = n;
            return;

        }
        Node cNode=head;
        while (cNode.next!=null) {

            cNode=cNode.next;
            
        }
        cNode.next=n;


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
            for(int i=1;i<p-1;i++){
                cNode=cNode.next;
            }
            cNode.next=cNode.next.next;
            System.out.println("deleted");
        }

    }
    public void rotate(int p){
        Node cNode=head;
        for(int i=1;i<=p;i++){
            //Node n = new Node(cNode.data);
            addEnd(cNode.data);
            cNode=cNode.next;
        }
        head=cNode;
    }
    



}











public class SLLProper {

    public static void main(String[] args) {
        SLinked l = new SLinked();
        l.createLL();
        //l.addMiddle(2, 2);
        //l.delete(3);
        l.rotate(2);
        l.displaySLL();
        for(int i=4;i>=0;i--)
        {
            System.out.println(l);
        }
        
    }
    
}

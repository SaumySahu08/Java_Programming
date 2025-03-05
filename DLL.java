import java.util.Scanner;

class DNode{
    DNode pre;
    int data;
    DNode next;
    DNode(int d){
        this.data=d;
    }

}
class DoubleLinkedList{

    Scanner sc=new Scanner(System.in);
    DNode head=null;
    public void createDLL(){

        System.out.println("How many length DoubleLinkedList you want");
        int n= sc.nextInt();
        if(n<=0){
            return;
        }
        
        System.out.println("Enter data");
        int d1=sc.nextInt();
        DNode hd=new DNode(d1);
        head = hd;
        DNode cDNode=head;
        for(int i=1;i<n;i++){
            System.out.println("Enter data");
            int k=sc.nextInt();
            DNode d = new DNode(k);
            cDNode.next=d;
            d.pre=cDNode;
            cDNode=cDNode.next;

            
        }
        




    }
    public void displayDLL(){
        if(head==null){
            System.out.println("Emty List");
            return;
        }
        DNode cDNode=head;
        int c=0;
        while(cDNode!=null){
            System.out.println(cDNode.data);
            cDNode=cDNode.next;
            c++;
        }
        System.out.println("Total = "+c);
    }

    public void addFirst(int d){
        
        DNode n = new DNode(d);
        if(head==null){
            head=n;
            return;
        }
        DNode cDNode=head;
        cDNode.pre=n;
        n.next=cDNode;
        head=n;

    }
    public void addEnd(int d){
        DNode n = new DNode(d);
        if(head==null){
            head=n;
        }
        DNode cNode = head;
        while(cNode.next!=null){
            cNode=cNode.next;
        }
        cNode.next=n;
        n.pre=cNode;
    }
    public void addMiddle(int d,int pos){

        if(pos==1){
            addFirst(d);
            //return;
        }
        else{
            DNode n = new DNode(d);
            DNode cDNode=head;
            for(int i=1;i<pos-1;i++){
                cDNode=cDNode.next;
            }
            n.next=cDNode.next;
            n.pre=cDNode;
            cDNode.next=n;
            cDNode.next.pre=n;

        }
        

    }
}







public class DLL {
    public static void main(String[] args) {
        DoubleLinkedList dl=new DoubleLinkedList();
        dl.createDLL();
        dl.displayDLL();
        //dl.addFirst(0);
        //dl.addEnd(4);
        dl.addMiddle(1, 1);
        dl.displayDLL();
    }
    
}

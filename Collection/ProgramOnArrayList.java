import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class ProgramOnArrayList {
    public static void main(String[] args) {
        // Write a program to reverse ArrayList in java?

        ArrayList lis = new ArrayList<>();
        lis.add("1");
        lis.add("2");
        lis.add("3");
        lis.add("4");
        System.out.println(lis.reversed());
        

        // Write a program to convert LinkedList to ArrayList?
        LinkedList l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        ArrayList a = new ArrayList<>(l1);
        System.out.println(a);

        // Write a program to remove element from ArrayList which contains only numbers
        // (ArrayList<Integer>) by using remove method of List interface as well as
        // remove method of Collcetion interface.

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(5);
        a1.add(3);
        a1.add(7);
        a1.add(9);
        a1.remove(Integer.valueOf(7));
        a1.remove(1);
        System.out.println(a1);

        // Write a program to merge to Collection data which contains fruits name.

        Vector<String> v1 = new Vector<>();
        v1.add("app");
        v1.add("or");
       ArrayList<String> fruit=new ArrayList<>();
       fruit.add("grap");
       fruit.add("Pinapp");
       v1.addAll(1,fruit);
       System.out.println(v1);

       //Write a Program to traverse the elements of ArrayList in both the    direction i.e forward and Backward.

       ArrayList<Integer> a2 = new ArrayList<>();
       a2.add(5);
       a2.add(3);
       a2.add(7);
       a2.add(9);
        
       ListIterator itr = a2.listIterator();
       while (itr.hasNext()) {
        System.out.println(itr.next());        
       }
       System.out.println("--------------------------------");
       while (itr.hasPrevious()) {
        System.out.println(itr.previous());        
       }
        

    }
}

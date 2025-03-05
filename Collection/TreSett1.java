import java.util.*;


record Product(Integer pid, String pname){
    Product{
        if(pid<=0){
            throw new IllegalArgumentException("Id should be non negative and non zero");
        }
    }
}


public class TreSett1 {
    public static void main(String[] args) {
        //1) Sort based on the pid in ascending order.
        //SortedSet<Product> products = new TreeSet<>((p1,p2)->p1.pid().compareTo(p2.pid()));

        //2) Sort based on the pid in descending order.
        //SortedSet<Product> products = new TreeSet<>((p1,p2)->p2.pid().compareTo(p1.pid()));

        //3) Sort based on the name in Alphabetical order.
        //SortedSet<Product> products = new TreeSet<>((p1,p2)->p1.pname().compareTo(p2.pname()));

        //4) Sort based on the name in Reverse order.
        // SortedSet<Product> products = new TreeSet<>((p1,p2)->p2.pname().compareTo(p1.pname()));



        // products.add(new Product(3, "L"));
        // products.add(new Product(1, "K"));
        // products.add(new Product(4, "O"));
        // products.add(new Product(2, "A"));
        // System.out.println(products);
        TreeSet<Integer> times = new TreeSet<Integer>();
            times.add(705);
            times.add(509);
            times.add(645);
            times.add(830);
            times.add(1010);
            times.add(1100);    
            TreeSet<Integer> subset = new TreeSet<Integer>();
            subset = times.headSet(800);			
            System.out.println(subset);
            System.out.println(subset.first());
            System.out.println(subset.last());
    }
}

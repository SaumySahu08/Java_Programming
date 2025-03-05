import java.util.ArrayList;
import java.util.Collections;

record Customer(Integer customerNumber, String customerName, Double customerBill){


}



public class Comparator1 {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Saumy", 1300.0));
        customers.add(new Customer(2, "Badal", 1100.0));
        customers.add(new Customer(3, "Vivek", 100.0));
        customers.add(new Customer(4, "C", 400.0));

        

        customers.sort((c1, c2) -> c1.customerNumber().compareTo(c2.customerNumber()) );
        customers.forEach(System.out::println);
        System.out.println("------------------------");
        customers.sort((c1, c2) -> c1.customerName().compareTo(c2.customerName()) );
        customers.forEach(System.out::println);
        System.out.println("------------------------");

        customers.sort((c1, c2) -> c1.customerBill().compareTo(c2.customerBill()) );
        customers.forEach(System.out::println);
        System.out.println("--------------Desc------------");

        customers.sort((c1, c2) -> c2.customerNumber().compareTo(c1.customerNumber()) );
        customers.forEach(System.out::println);
        System.out.println("------------------------");
        customers.sort((c1, c2) -> c2.customerName().compareTo(c1.customerName()) );
        customers.forEach(System.out::println);
        System.out.println("------------------------");

        customers.sort((c1, c2) -> c2.customerBill().compareTo(c1.customerBill()) );
        customers.forEach(System.out::println);
    }
     
}

import java.util.*;

record Product(Integer productNumber, String productName, Double productPrice) implements Comparable<Product>{
public int compareTo(Product p2) {
    return this.productName.compareTo(p2.productName);
    //return this.productNumber-p2.productNumber;
};
}





public class Comparable1 {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Mobile", 1200D));
        products.add(new Product(2, "Camera", 1200D));
        products.add(new Product(3, "Vib", 1200D));
        products.add(new Product(4, "A", 1200.0));
        
        Collections.sort(products);
       products.forEach(System.out::println);
    }
}

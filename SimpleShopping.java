class InsufficientQuantityException extends Exception{
    InsufficientQuantityException(){

    }
    InsufficientQuantityException(String s){
        super(s);
    }
}

class InvalidProductException extends RuntimeException {
    InvalidProductException(){
        
    }
    InvalidProductException(String s){
        super(s);
    }
}


class Product{
    int id;
    String name;
    double price;
    int quantity;
    Product(int i,String s, double p, int q){
        this.id=i;
        this.name=s;
        this.price=p;
        this.quantity=q;
        
    }
    public void decreaseQuantity(int q) throws InsufficientQuantityException{
        if(q>this.quantity){
            throw new InsufficientQuantityException("Insufficient Quantity of product."); 
        }
        this.quantity=this.quantity-q;
    }
}
class ShoppingCart{
    Product cartItems[];
    int itemCount=0;
    ShoppingCart(int capacity){
        cartItems=new Product[capacity];
    }
    public void addToCart(Product p,int quantity)throws InsufficientQuantityException{
        if(p==null){
            throw new InvalidProductException("This Product is Invalid. Because it is not found.");
        }
        
        if(quantity>p.quantity){
            throw new InsufficientQuantityException("Product not available for this "+quantity+" quantity");
        }
        for( int i=1;i<=quantity;i++){
            cartItems[itemCount]=p;
            itemCount++;
            
        }
        p.quantity=p.quantity-quantity;
    }
    public double calculateTotal(){
        double tp=0;
        for(int i=0;i<itemCount;i++){
            Product p=cartItems[i];

            tp=tp+p.price;

        }
        return tp;
    }
}




public class SimpleShopping {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Watch", 1000, 5);
        Product p2 = new Product(2, "Goggle", 2000, 10);
        Product p3 = new Product(3, "Shirt", 500, 5);
        ShoppingCart s1 = new ShoppingCart(50);
        try {
            s1.addToCart(p1, 2);
            s1.addToCart(p2, 2);
            s1.addToCart(p3, 2);
            System.out.println(s1.calculateTotal());
            System.out.println(s1.itemCount);
        } 
        catch (InsufficientQuantityException e) {
            System.out.println("Exception: "+e);
        }
        catch (InvalidProductException e) {
            System.out.println("Exception: "+e);
        }
        

    }
}

class InvalidItemException extends Exception{
    InvalidItemException(){

    }
    InvalidItemException(String s){
        super(s);
    }
}
class  OutOfStockException extends RuntimeException{
    OutOfStockException(){

    }
    OutOfStockException(String s){
        super(s);
    }
}


class ShoppingCart{
    private int availableItems ;
    ShoppingCart(int a){
        this.availableItems=a;

    }
    public void addItem(int quantity) throws InvalidItemException{
        if(quantity<=0){
            throw new IllegalArgumentException("Enter valid quantity positiveor non zero");
        }
        if(quantity>availableItems){
            throw new InvalidItemException("Items are less in quantity.");

        }
        availableItems=availableItems-quantity;
        System.out.println("Items added:"+quantity);
    }
    public void addItemUnchecked(int quantity) {
        if(quantity<=0){
            throw new IllegalArgumentException("Enter valid quantity positiveor non zero");
        }
        if(availableItems<=0){
            throw new OutOfStockException("Item Out of Stock");

        }
        try {
            addItem(quantity);
        } catch (InvalidItemException e) {
            System.out.println("Exception: "+e);
        }
    }
}





public class ShoppingCartScenario {
    public static void main(String[] args) {
        ShoppingCart s1 = new ShoppingCart(50);
        try {
            s1.addItem(20);
            s1.addItemUnchecked(30);
            s1.addItemUnchecked(-10);
        }
         catch (InvalidItemException e) {
            System.out.println("Exception: "+e);
        }
         catch (OutOfStockException e) {
            System.out.println("Exception: "+e);
        }
         catch (IllegalArgumentException e) {
            System.out.println("Exception: "+e);
        }
         catch (Exception e) {
            System.out.println(e);
        }
    }
}

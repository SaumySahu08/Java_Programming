

class Product {
    protected String name;
    protected double price;

    Product(String n,double p){
        this.name=n;
        this.price=p;

    }

    public void displayInfo(){
        System.out.println("[name = "+name+" price = "+price+"]");
    }
    public double calculateTotalCost(int quantity){
       return quantity*price;
    }

    
}
class Electronics extends Product {
    private String brand;
    
    Electronics(String nm,double pr,String br){
        super(nm, pr);
        this.brand=br;
        
    }
    public void displayInfo(){
        System.out.println("[name = "+name+" price = "+price+"brand = "+brand+"]");
    }


    
}
class Clothing extends Product{

    private String size;

    Clothing(String nm,double pr,String sx){
        super(nm,pr);
        this.size=sx;
    }
    public void displayInfo(){
        System.out.println("[name = "+name+" price = "+price+"size = "+size+"]");
    }



}



public class Prd {
    public static void main(String[] args) {
        Electronics e = new Electronics("Watch", 1200.45, "G-Sock");
        Clothing c = new Clothing("T-Short", 1050.44, "XL");
        e.displayInfo();
        c.displayInfo();
        System.out.println("Total cost = "+(e.calculateTotalCost(2)+c.calculateTotalCost(4)));

        

    }
    
}

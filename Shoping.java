class Order{
    private String orderID;
    private String productName;
    public Order(String oid,String pname){
        if(Integer.parseInt(oid)<=0){
            System.err.println("Error");
            System.exit(0);
        }

        this.orderID=oid;
        this.productName=pname;

    }

    public String getOrderID(){
        return orderID;
    }
    public String getProductName(){
        return productName;
    }
    @Override
    public String toString(){
        return "OrderId = "+orderID+" ProductName = "+productName;
    }
}

class Customer{
    private String name;
    private String email;
    private Order order;
    public Customer(String name,String email,Order order){
        this.name=name;
        this.email=email;
        this.order=order;
    }
    @Override
    public String toString(){
        return "name = "+name+" email=" +email+" "+order;
    }
}










public class Shoping {
    public static void main(String[] args) {
        Order o1 = new Order("0", "Laptop");
        Customer c1 = new Customer("James", "James@example.com", o1);
        System.out.println(c1);
    }
    
}

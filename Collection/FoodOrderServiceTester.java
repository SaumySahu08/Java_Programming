import java.util.ArrayList;

class FoodCustomer{
    int customerId;
    String customerName;
    String address;
    String phoneNumber;
    FoodCustomer(){

    }
    FoodCustomer(int c, String s, String a, String p){
        this.customerId=c;
        this.customerName=s;
        this.address=a;
        this.phoneNumber=p;
    }
}
class FoodOrderService{
    String name;
    ArrayList<FoodCustomer> foodCustomers;
    FoodOrderService(String n){
        this.name=n;
        this.foodCustomers=new ArrayList<>();
    }
    public void placeOrder(FoodCustomer f){
        foodCustomers.add(f);
    }
    public boolean isFirstTimeCustomer(FoodCustomer f){
        int c=0;
        for (FoodCustomer foodCustomer : foodCustomers) {
            if(f.phoneNumber.equals(foodCustomer.phoneNumber)){
                c++;
            }            
            
        }
        this.placeOrder(f);
        return c==0;
    }
    public double calculateBill(FoodCustomer f, double base){
        if(isFirstTimeCustomer(f)){
            
            return 0;
        }
        else{
            return base;
        }
    }
    public void printBill(FoodCustomer f, double base){
        System.out.println("Oreder confirmed");
        System.out.println("Name: "+f.customerName);
        System.out.println("Bill: "+calculateBill(f, base));
    }

}

public class FoodOrderServiceTester {
    public static void main(String[] args) {
        FoodOrderService f = new FoodOrderService("Burger King");
        FoodCustomer c1= new FoodCustomer(1, "Saumy", "Ameerpet", "7477");
        FoodCustomer c2= new FoodCustomer(2, "Vivek", "Kukat", "8877");
        FoodCustomer c3= new FoodCustomer(2, "Vivek", "Kukat", "7477");
        f.placeOrder(c1);
        f.placeOrder(c2);
        f.placeOrder(c3);
        f.printBill(c1, 50);
        f.printBill(c2, 50);
        f.printBill(c3, 50);

    }
}

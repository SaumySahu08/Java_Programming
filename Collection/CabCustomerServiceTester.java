//package Collection;

import java.util.ArrayList;

record CabCustomer(Integer custId, String customerName, String pickupLocation, String dropLocation, Integer distance, String phone) {

}

class CabCustomerService{
    ArrayList<CabCustomer> cabCustomers = new ArrayList<>();
    public void addCabCustomer(CabCustomer cust){
       /* try {
            if(!isFirstCustomer(cust))
        this.cabCustomers.add(cust);
        else{
           throw new RuntimeException("Customer already added");
        }
        } catch (RuntimeException e) {
            System.out.println(e.toString());
        }*/
        this.cabCustomers.add(cust);
    }
    public boolean isFirstCustomer(CabCustomer cust){
         int count=0;
        for (CabCustomer cabCustomer : cabCustomers) {
            if(cabCustomer.phone().equals(cust.phone())){
                count++;
            }
             
        }
        return count==1;
    }

    public double calculateBill(CabCustomer cust){
        
       if(isFirstCustomer(cust)){
             return 0;
       }
       else {
        if(cust.distance()<=4){
            return 80;
        }
        else if(cust.distance()>4){
            return (80+(6*cust.distance()));
        }
        return 0;
       }
       /*  if(this.cabCustomers.contains(cust)){
            if(cust.distance()<=4){
                return 80;
            }
            else if(cust.distance()>4){
                return (80+(6*cust.distance()));
            }
            return 0;
        }
        return 0;*/
    }
    public void printBill(CabCustomer cust){
        /*if(this.cabCustomers.contains(cust))
        
        System.out.println(cust.customerName()+"
         Please pay your bill of Rs."+calculateBill(cust));
         */
        System.out.println("The customer bill  is Rs."+this.calculateBill(cust)+
                  "having the name as  "+cust.customerName());
    }

}


public class CabCustomerServiceTester {
    public static void main(String[] args) {
        CabCustomer c1 = new CabCustomer(1, "Saumy", "Ameerpet", "Goa", 10, "7477");
        CabCustomer c2 = new CabCustomer(1, "Saumy", "Ameerpet", "Goa", 12, "7477");
        CabCustomer c3 = new CabCustomer(1, "Sudeep", "Ameerpet", "Goa", 11, "7488");
        CabCustomer c4 = new CabCustomer(1, "Suraj", "Ameerpet", "Goa", 15, "7499");

        CabCustomerService s1 = new CabCustomerService();
     
        s1.addCabCustomer(c1);
        s1.addCabCustomer(c2);
        s1.addCabCustomer(c3);
        s1.addCabCustomer(c4);
       
        

        s1.printBill(c1);
        s1.printBill(c2);
        s1.printBill(c3);
        s1.printBill(c4);
    }
}

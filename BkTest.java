class Vehicle{
    String make;
    String model;
    int  year;

    Vehicle(String ma,String mo,int ye){
        
        
        this.make=ma;
        this.model=mo;
        

        this.year=ye;
    }
    public void displayDetails(){
        System.out.println("Make = "+make+" Model = "+model+" Year = "+year);
    }

}
class Car extends Vehicle{
    int numberOfDoors;
    Car(String ma,String mo,int ye,int nod){
        
        super(ma, mo, ye);
        
        this.numberOfDoors=nod;
    }
    public void displayDetails(){
        System.out.println("Make = "+make+" Model = "+model+" Year = "+year+" NumberOfDoors = "+numberOfDoors);
    }

}
class Bike extends Vehicle{
    String type;
    Bike(String ma,String mo,int ye,String ty){
        super(ma, mo, ye);
        this.type=ty;
    }
    public void displayDetails(){
        System.out.println("Make = "+make+" Model = "+model+" Year = "+year+" Type = "+type);

        
    }
}



public class BkTest {
    public static void main(String[] args) {
        Car c = new Car("Audi", "A7", 2018, 4);
       Bike b = new Bike("Honda", "Sp shine", 0, "NormalUses");
        if(c.year > 0 && c.numberOfDoors > 0){
            c.displayDetails();
        }
        else{
            System.out.println("Error");
        }
        if(b.year>0){
            b.displayDetails();
        }
        else{
            System.out.println("Error");
        }
        
        
        
    }
    
}

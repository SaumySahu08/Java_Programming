
abstract class Car{
    String brand;
     String model;
     int milage;
     int top_speed;
     int yearOfManufacture;
    Car(){
        super();
    }
    public String carBrand(String s){
        this.brand=s;
        return brand;
    }
    public String carModel(String s){
        this.model=s;
        return model;
    }
    public int carMilage(int m){
        this.milage=m;
        return milage;
    }
    public int carTopSpeed(int m){
        this.top_speed=m;
        return top_speed;
    }
    public int carYear(int m){
        this.yearOfManufacture=m;
        return yearOfManufacture;
    }
    abstract public void display();

}





public class TestCar10 extends Car {
    public static void main(String[] args) {
        TestCar10 t = new TestCar10();
        t.carBrand("BMW");
        t.carModel("S7");
        t.carMilage(70);
        t.carTopSpeed(240);
        t.carYear(2021);
        t.display();
    }
    @Override
    public void display(){
        System.out.println("Brand = "+brand+"\n"+"Model = "+model+"\n"+" Milage = "+milage+"Km/h\n"+"TopSpeed = "+top_speed+"Km/h\n"+" Year = "+yearOfManufacture);
    }
}

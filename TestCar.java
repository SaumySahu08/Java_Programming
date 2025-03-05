class Engine {
    private String model;
    public Engine(String m){
        this.model=m;

    }

    public String getModel(){
        return model;
    }
    //public void setModel(String m){
    //    this.model=m;
    //}
    @Override
    public String toString(){
        return "Model = "+model;
    }
    
}
class Car {
    private String make;
    private String model;
    private Engine engine;

    public Car(String make,String model,Engine engine){
        this.make=make;
        this.model=model;
        this.engine=engine;
    }
    @Override
    public String toString(){
        return "Car = "+make+" Model = "+model+" Engine = "+engine;
    }

}

public class TestCar {
    public static void main(String[] args) {
        Engine e1 = new Engine("V6 Hybrid");
        Car c1 = new Car("Hyundai", "Camry", e1);
        System.out.println(c1);

    }
    
}

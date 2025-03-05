
class Vehicle {

    String brand;
    int year;
    Vehicle(String b,int y){
        this.brand=b;
        this.year=y;
    }
    public void displayVehicleDetails(){
        System.out.println("Brand = "+brand+" Year = "+year);
    }

    
}

class Motorcycle extends Vehicle{

    int engineCapacity;
    Motorcycle(String brand, int year, int engineCapacity){
        super(brand,year);
        this.engineCapacity=engineCapacity;

    }
    public  void startEngine(){
        System.out.println("The Engine is Starting = "+engineCapacity+" cc");
    }
}
class SportMotorcycle extends Motorcycle{
    boolean raceMode;
    SportMotorcycle(String brand, int year, int engineCapacity, boolean rm){
        super(brand,year,engineCapacity);
        this.raceMode=rm;
    }
    public void activateRaceMode(){
        this.raceMode=true;
        System.out.println("Now RaceMode is On");
    }
    public void displaySportMotorcycleDetails(){
        System.out.println("Brand = "+brand+" Year = "+year+" Enginecapacity = "+engineCapacity+" cc "+"RaceMode = "+raceMode);

    }


}


public class Mtrcycl {
    public static void main(String[] args) {
        SportMotorcycle s=new SportMotorcycle("Ducati", 2023,1200, false);
        s.startEngine();
        s.activateRaceMode();
        s.displaySportMotorcycleDetails();
    }
    
}

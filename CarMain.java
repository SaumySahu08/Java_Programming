class Car{

    private String brand;
    private String model;
    private int year;
    private Driver driver;

    public Car(String b,String m,int y, Driver d){
        if(y<=0){
            System.err.println("Invalid Year");
            System.exit(0);

        }
        this.brand=b;
        this.model=m;
        this.year=y;
        this.driver=d;
    }
    public Car(Car c){
        this.brand=c.brand;
        this.model=c.model;
        this.year=c.year;
        this.driver=c.driver;
    }
    public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
    public void changeDriver(Driver newDriver){
        this.driver=newDriver;
    }

    @Override
    public String toString(){
        return "Brand = "+brand+" Model = "+model+" Year"+year+" "+driver;
    }
}

class Driver{
    private String name;
    private int age;
    public Driver(String n,int a){
        if(a<=0){
            System.err.println("Invalid age");
            System.exit(0);
        }
        this.name=n;
        this.age=a;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setAge(int a){
        this.age=a;
    }
    public String toString(){
        return "Driver Name = "+name+" Age = "+age;
    }
}


public class CarMain {

    public static void main(String[] args) {
        
        Driver Jone = new Driver("John", 30);
               Car Indica = new Car("Hyundai", "Creta", 2020, Jone);
               Driver Logan = new Driver("Logan", 35);
               Car Indica1=new Car(Indica);
               Indica1.changeDriver(Logan);
               System.out.println(Indica);
               System.out.println(Indica1);
               
    }   
    
}

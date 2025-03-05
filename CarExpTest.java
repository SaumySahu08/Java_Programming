class CarStoppedException extends Exception{
    CarStoppedException(){
        super();
    }
    CarStoppedException(String errorMessage){
        super(errorMessage);
    }
}

class CarPunctureException extends Exception{
    CarPunctureException(){

    }
    CarPunctureException(String error){
        super(error);
    }
}
class CarHeatException extends Exception{
    CarHeatException(){
        
    }
    CarHeatException(String error){
        super(error);
    }
   
}


class CarTest {
    public static void  stop(String stop) throws CarStoppedException{
        if(stop.equalsIgnoreCase("stop")){
            throw new CarStoppedException("Car stopped for some reason.");
        }
        else{
            throw new CarStoppedException("Car not stalled");
        }
    }
    public static void  puncture(String stop) throws CarPunctureException{
        if(stop.equalsIgnoreCase("puncture")){
            throw new CarPunctureException("Car is Punctured.");
        }
        else if(stop.equalsIgnoreCase("move")){
            System.out.println("Car not punctured.");
        }
        else{
            throw new CarPunctureException("Car not stalled");
        }
    }
    public static void  carHeat(int h) throws CarHeatException{
        if(h>50){
            throw new CarHeatException("Car is heated more than 50 degrees.");
        }
        else{
            System.out.println("Car temperature normal.");
        }
    }
}

public class CarExpTest {
    public static void main(String[] args) throws Exception{
        // System.out.println("Car Stopped Exception Test:");
        // CarTest.stop("stop");
        // System.out.println();
        // System.out.println("Car Not Started Test:");
        // CarTest.stop("go");
        // System.out.println();
        // System.out.println("Car Puncture Exception Test:");
        // CarTest.puncture("puncture");
        // System.out.println();
        // System.out.println("Car Not Punctured Test");
        // CarTest.puncture("move");
        // System.out.println();
        // System.out.println("Car Overheating Exception Test:");
        // CarTest.carHeat(60);

        // System.out.println();
        System.out.println("Car Temperature Normal Test:");
        CarTest.carHeat(40);



    }   

    
}
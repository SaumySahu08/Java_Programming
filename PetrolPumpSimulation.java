import java.util.Scanner;

class PetrolPump{
    public synchronized void refilling(String carName){
        System.out.println(carName+" started refilling...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(carName+" completed refilling!.");
    }
}
class Car implements Runnable{
    String carName;
    PetrolPump petrolPump;
    Car(String carName, PetrolPump p){
        this.carName=carName;
        this.petrolPump=p;
    }
    public void run() {
        petrolPump.refilling(carName);
    };
}









public class PetrolPumpSimulation {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // PetrolPump p = new PetrolPump();
        // while(true)
        // {
        //     System.out.println("Enter car nane");
        //     String carName=sc.nextLine();
        //     Car c1=new Car(carName, p);
        //     Thread t1 = new Thread(c1);
        //     t1.start();
        //     try{
        //         t1.join();
        //         }
        //         catch(InterruptedException e){
        //             System.out.println(e);
        //         }
        // }
        PetrolPump p = new PetrolPump();
        Car c1=new Car("Audi", p);
        Car c2=new Car("Thar", p);
        Car c3=new Car("Bugati", p);
        Car cars []= {c1,c2,c3};
        
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3= new Thread(c3);
        Thread threads []={t1,t2,t3};
        for (Thread thread : threads) {
            thread.start();
            try{
            thread.join();
            Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
        
    }
}

class VaccineEligibility{
    private int age;
    private boolean hasHealthCondition;
    VaccineEligibility(int age, boolean h){
        this.age=age;
        this.hasHealthCondition=h;
    }
    public boolean isELigible(){
        if((age>=18 && age<60)||hasHealthCondition==true){
            return true;
        }
        else return false;
    }
}
class DoseBooking{
    private boolean booked;
    public void bookDose(){
        if(isDoseBooked()){
            throw new RuntimeException("Dose already booked.");

        }
        booked = true;
    }
    public boolean isDoseBooked(){
        if(booked==true){
            return true;
        }
        else return false;
    }
}

class User{
    private String name;
    private VaccineEligibility eligibility;
    private DoseBooking doseBooking;
    User(String sn, int age,boolean health){
        this.name=sn;
        this.eligibility=new VaccineEligibility(age, health);
        this.doseBooking=new DoseBooking();

    }
    public boolean isELigible(){
        return eligibility.isELigible();
    }
    public void bookDose(){
        if(isELigible()){
            if(!isDoseBooked())
            doseBooking.bookDose();
        }
        else throw new RuntimeException("You are not eligible for the vaccine.");
    }
    public boolean isDoseBooked(){
        return doseBooking.isDoseBooked();
    }
}




public class CoronaVaccineApp {
    public static void main(String[] args) {
        User user1 = new User("Saumy", 18, false);
        User user2 = new User("Suraj", 61, false);
        Thread thread1 = new Thread(() -> {
            try {
                user1.bookDose();
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                user2.bookDose();
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        });

        thread1.start();
        thread2.start();
    }
}

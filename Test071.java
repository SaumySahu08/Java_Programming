class Booking{
    String name;
    double price;
    Booking(String n,double p){
        this.name=n;
        this.price=p;
    }
    public void bookFlight(String airlines){
        System.out.println("Name = "+name+" Price = "+price+" airlines = "+airlines);

    }
    public void bookHotel(int numberOfNights){
        System.out.println("Name = "+name+" Price = "+price+" numberOfNights = "+numberOfNights);
    }
    public void bookActivity(String activityType){
        System.out.println("Name = "+name+" Price = "+price+" activityType = "+activityType);

    }
}
class Flight extends Booking{

    Flight(String n,double p){
        super(n, p);
    }
    @Override
    public void bookFlight(String airlines){
        System.out.println("Flight Booked : "+name);
        System.out.println(" airlines = "+airlines+" Price = "+price);

    }


}
class Hotel extends Booking{
    Hotel(String n,double p){
        super(n, p);
    }
    @Override
    public void bookHotel(int numberOfNights){
        System.out.println("Hotel Booked : "+name);
        System.out.println(" numberOfNights = "+numberOfNights+" Price = "+price);
    }
}
class Activity extends Booking{
    Activity(String n,double p){
        super(n, p);
    }
    @Override
    public void bookActivity(String activityType){
        System.out.println("Activity Booked : "+name);
        System.out.println(" activityType = "+activityType+" Price = "+price);

    }
}


public class Test071 {

    public static void main(String[] args) {
        Flight f = new Flight("Round Trip to Paris", 500);
        f.bookFlight("Air France");
        System.out.println();
        Hotel h = new Hotel("Luxury Suite", 200);
        h.bookHotel(5);
        System.out.println();
        Activity a = new Activity("City Tour", 50);
        a.bookActivity("Sightseeing");
    }

}
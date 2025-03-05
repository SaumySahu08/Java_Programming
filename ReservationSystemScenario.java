class SeatUnavailableException extends Exception{
    SeatUnavailableException(){

    }
    SeatUnavailableException(String s){
        super(s);
    }
}
class InvalidReservationException extends RuntimeException{
    InvalidReservationException(){

    }
    InvalidReservationException(String s){
        super(s);
    }
}

class ReservationSystem{
    private int availableSeats ;
    ReservationSystem(int a){
        this.availableSeats=a;
    }
    public void reserveSeat(int numberOfSeats) throws SeatUnavailableException{
        if((numberOfSeats<=availableSeats)==false){
            throw new SeatUnavailableException("Seat unavailable");
        }
        availableSeats=availableSeats-numberOfSeats;
        System.err.println("Reserved: "+numberOfSeats);
       
    }
    public void reserveSeatUnchecked(int numberOfSeats){
        if(availableSeats<=0){
            throw new InvalidReservationException("Seat unavailable");
        }
        try {
            reserveSeat(numberOfSeats);
            
        } catch (SeatUnavailableException e) {
            System.out.println("Exception: "+e);
        }
    }

}
public class ReservationSystemScenario {

    public static void main(String[] args) {
        ReservationSystem r1 = new ReservationSystem(30);
        try {
            r1.reserveSeat(20);
            r1.reserveSeatUnchecked(10);
            r1.reserveSeatUnchecked(10);
        } catch (SeatUnavailableException e) {
            System.out.println("Exception: "+e);
        }
        catch(InvalidReservationException e){
            System.out.println("Exception: "+e);
        }

    }
}
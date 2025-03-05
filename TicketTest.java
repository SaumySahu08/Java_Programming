
class Ticket{

    private String eventName;
    private int seatNumber;
    private double price;
    Ticket(String e,int s,double p){
        this.eventName=e;
        if(s<=0||p<=0){
            System.out.println("Error");
            System.exit(0);
        }
        this.seatNumber=s;
        this.price=p;
        
    }
    public void getEventName(){
        System.out.println("Event Name = "+eventName);
    }
    public void getSeatNumber(){
        System.out.println("seatNumber = "+seatNumber);
    }
    public void getPrice(){
        System.out.println("Price = "+seatNumber);
    }
    public void setEventName(String e){
        this.eventName=e;
    }
    public void setSeatNumber(int a){
        this.seatNumber=a;
    }
    public void setPrice(double a){
        this.price=a;
    }
    public void displayDetails(){
        System.out.println("Regular Ticket :");
        System.out.println("Event : " +eventName);
        System.out.println("Seat Number : "+seatNumber);
        System.out.println("Price :$"+price);

    }
    
}
class VIPTicket extends Ticket{

    private String specialAccess;
    
    

    VIPTicket(String e,int s,double p,String sp){
        super(e, s, p);
        this.specialAccess=sp;
        //System.out.println("Special Access :"+sp);
    }
    public void getSP(){
        System.out.println("specialAccess = "+specialAccess);
    }
    public void setSP(String s){
        this.specialAccess=s;
    }
    public void displayDetails(){
        System.out.println("VIP Ticket");
        getEventName();
        getSeatNumber();
        getPrice();
        getSP();
    }

}
class StudentTicket extends Ticket{

    private boolean studentDiscount;
    
    

    StudentTicket(String a,int s,double p , boolean st){
        super(a, s, p);
        this.studentDiscount=st;
        //System.out.println("Student Discount : "+st);
    }
    public void getSD(){
        if(studentDiscount==true)
        System.out.println("studentDiscount = Yes");
        else
        System.out.println("studentDiscount = No");
    }
    public void setSD(boolean sd){
        this.studentDiscount=sd;
    }
    public void displayDetails(){
        System.out.println("VIP Ticket");
        getEventName();
        getSeatNumber();
        getPrice();
        getSD();
    }
}

public class TicketTest {
    public static void main(String[] args) {
        Ticket t=new Ticket("Concert", 101, 50.0);
        VIPTicket v = new VIPTicket("VIP Concert", 201, 100.0, "BackStage Access");
        StudentTicket s = new StudentTicket("Student Event", 301, 30.0, true);
        t.displayDetails();
        v.displayDetails();
        s.displayDetails();
    }
    
}

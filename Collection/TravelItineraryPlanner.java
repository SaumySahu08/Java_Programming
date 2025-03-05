import java.util.ArrayList;

class Activity{
    String name;
    String schedule;
    Activity(String s,String n){
        name=s;
        schedule=n;
    }
    public String getName(){
        return name;
    }
    public void setName(String s){
        this.name=s;
    }
    public String getSchedule(){
        return schedule;
    }
    public void setSchedule(String s){
        this.schedule=s;
    }
    public String toString(){
        return "- "+name+" ("+schedule+")";
    }
}
class Desination{
    String name;
    ArrayList<Activity> activities;
    Desination(String s){
        this.name=s;
        activities=new ArrayList<Activity>();
    }

    public void addActivitiy(Activity a){
        this.activities.add(a);
    }
    public void displayAllActivities(){
        activities.forEach(act->System.out.println(act));
    }

    public String toString(){
        return "Destination: "+name;
    }
}
class ItineraryPlanner{
    ArrayList<Desination> desinations;
    ItineraryPlanner(){
        this.desinations=new ArrayList<Desination>();
    }
    public void addDestinations(Desination d){
        this.desinations.add(d);
    }
    public void displayAllDestinantions(){
        desinations.forEach(dst->{
            System.out.println(dst.toString());
            dst.displayAllActivities();
        });
    }
}



public class TravelItineraryPlanner {
    public static void main(String[] args) {
        ItineraryPlanner i=new ItineraryPlanner();
        Desination d1 = new Desination("Paris");
        Desination d2 = new Desination("London");
        i.addDestinations(d1);
        i.addDestinations(d2);
        Activity a1 =new Activity("Visit Eiffel Tower", "Morning");
        Activity a2 =new Activity("Louvre Museum", "Afternoon");
        Activity a3 =new Activity("British Museum", "Morning");
        Activity a4 =new Activity("London Eye", "Afternoon");
        d1.addActivitiy(a1);
        d1.addActivitiy(a2);
        d2.addActivitiy(a3);
        d2.addActivitiy(a4);
        i.displayAllDestinantions();
    }
}

interface SIMCardInterface {
    String getPhoneNumber();
    String networkProvider();
    void activate();
    void deactivate();
    
}
class Jio implements SIMCardInterface{
    String phoneNum;
    boolean isActive;
    Jio(String p ){
        this.phoneNum=p;
        isActive=false;
    }
    public String  getPhoneNumber(){
        return phoneNum;
    }
    public String networkProvider(){
        return "Jio";
    }
    public void activate(){
        if(isActive==false){
            isActive=true;
            System.out.println(networkProvider()+" sim is activate");
        }
        else{
            System.out.println(networkProvider()+" sim is already active");
        }
    }
    public void deactivate(){
        if(isActive==true){
            isActive=false;
            System.out.println(networkProvider()+" sim is deactivate");
            
        }
        else{
            System.out.println(networkProvider()+" sim is already deactivate");

        }
    }
}
class Airtel implements SIMCardInterface{
    String phoneNum;
    boolean isActive;
    Airtel(String p ){
        this.phoneNum=p;
        isActive=false;
    }
    public String  getPhoneNumber(){
        return phoneNum;
    }
    public String networkProvider(){
        return "Airtel";
    }
    public void activate(){
        if(isActive==false){
            isActive=true;
            System.out.println(networkProvider()+" sim is activate");
        }
        else{
            System.out.println(networkProvider()+" sim is already active");
        }
    }
    public void deactivate(){
        if(isActive==true){
            isActive=false;
            System.out.println(networkProvider()+" sim is deactivate");
            
        }
        else{
            System.out.println(networkProvider()+" sim is already deactivate");

        }
    }
}
class BSNL implements SIMCardInterface{
    String phoneNum;
    boolean isActive;
    BSNL(String p ){
        this.phoneNum=p;
        isActive=false;
    }
    public String  getPhoneNumber(){
        return phoneNum;
    }
    public String networkProvider(){
        return "BSNL";
    }
    public void activate(){
        if(isActive==false){
            isActive=true;
            System.out.println(networkProvider()+" sim is activate");
        }
        else{
            System.out.println(networkProvider()+" sim is already active");
        }
    }
    public void deactivate(){
        if(isActive==true){
            isActive=false;
            System.out.println(networkProvider()+" sim is deactivate");
            
        }
        else{
            System.out.println(networkProvider()+" sim is already deactivate");

        }
    }
}
interface  MobilePhoneInterface {
    void insertSim(SIMCardInterface s);
    void removeSim();
    void makeCall(String phoneNum);
    void sendMessage(String phoneNum,String message);
    
}
class MobilePhone{
   
    SIMCardInterface sim;
    
    public void insertSim(SIMCardInterface s){
        if(this.sim==null){
            this.sim=s;
            System.out.println(s.networkProvider()+"Sim card inserted");
            s.activate();
        }      
        else {
            System.out.println("SIM card slot is already occupied.");
        }
    }
    public void removeSim(){
        if(sim!=null){
            sim.deactivate();
            System.out.println("sim is removed");
            sim=null;
        }
        else{
            System.out.println("No SIM card inserted.");
        }
    }
    public void makeCall(String pn){
        if (sim != null) {
            System.out.println("Making call to " + pn + " using " + sim.networkProvider() + " SIM card.");
        } else {
            System.out.println("No SIM card inserted.");
        }
    }
    public void sendMessage(String p1,String message){
        if (sim != null) {
            System.out.println("Sending text message to " + p1 + " using " + sim.networkProvider() + " SIM card.");
            System.out.println("Message: " + message);
        } else {
            System.out.println("No SIM card inserted.");
        }                

    }
}





public class InterSIMCard {
    public static void main(String[] args) {
        SIMCardInterface jio= new Jio("9926766883");
        MobilePhone m = new MobilePhone();
        m.insertSim(jio);
        m.makeCall("7477455934");
        m.sendMessage("7477255934", "Hello");
        System.out.println();
        SIMCardInterface air=new Airtel("7225995574");
        m.insertSim(air);

        m.removeSim();
        m.insertSim(air);
    }
}

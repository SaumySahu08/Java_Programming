import java.util.*;
class AddressBook{
    HashMap<String,String> addresses;
    Scanner s = new Scanner(System.in);
    AddressBook(){
        this.addresses=new HashMap<>();
    }
    public void addContact(){
        System.out.println("Enter Contact Name:");
        String n = s.nextLine();
        System.out.println("Enter Contact Number:");
        addresses.put(n, s.nextLine());
        System.out.println("Contact Added Successfully...");
    }
    public void removeContact(){
        if(addresses.isEmpty()){
            System.out.println("AddressBook is Empty...");
            return;
        }
        System.out.println("Enter Contact Name to Remove:");
        String name = s.nextLine();
        if (addresses.containsKey(name)) {
            addresses.remove(name);
            System.out.println("Contact Removed Successfully...");

        }
        else{
            System.out.println("Contact is not found...");
            
        }
    }
}





public class AddressBookApp {
    public static void main(String[] args) {
        try {
        Scanner s= new Scanner(System.in);
        boolean f = true;
        AddressBook a = new AddressBook();
        while (f) {
            System.out.println("Options:");
            System.out.println("1. Add Contact\n"+
            "2. Remove Contact\n"+
            "3. Exit");
            
            switch (s.nextInt()) {
                case 1:a.addContact();                    
                    break;

                case 2:a.removeContact();
                    break;

                case 3:f=false;
                    break;
                default:System.out.println("Ivalid Option!");
                    break;
            }
        }
        
        } catch (InputMismatchException e) {
           System.out.println(e.toString());
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}

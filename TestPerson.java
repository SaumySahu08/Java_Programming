import javax.print.DocFlavor.STRING;

class Address{
    private String street;
    private String city;
    public Address(String s,String c){
        this.street=s;
        this.city=c;
    }
    public String getStreet(){
        return street;
    }
    public String getCity(){
        return city;
    }
    @Override
    public String toString(){
        return "Street = "+street+" City = "+city;
    }
}
class Person{
    private String name;
    private Address address;
    public Person(String n,Address a){
        this.name=n;
        this.address=a;
    }
    @Override
    public String toString(){
       return " Name = "+name+" "+address;
    }
}







public class TestPerson {
    public static void main(String[] args) {
        Address a = new Address("123 Elm Street", "Springfield");
        Person person = new Person("John Doe", a);
        System.out.println(person);
    }
    
}

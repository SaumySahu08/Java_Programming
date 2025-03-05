class Animal{
    private String name;
    Animal(String a){
        this.name=a;
    }
    public void getName(){
        System.out.println("Name = "+name);

    }
    public void setName(String s){
        this.name=s;
    }
    public void displayDetails(){
        System.out.println("Name = "+name);
    }
}
class Mammal extends Animal{
    private boolean hasFur;
    Mammal(String s,boolean hf){
        super(s);
        this.hasFur=hf;
    }
    public void getHasFur(){
        System.out.println("hasFur = "+hasFur);
    }
    public void setHasFur(boolean h){
        this.hasFur=h;
    }
    public void displayDetails(){
        super.displayDetails();
        if(hasFur==true)
        System.out.println("hasFur = Yes");
        else
        System.out.println("hasFur = No");
 
}
}
class Dog extends Mammal{

    private String breed;
    Dog(String s,boolean h,String b){
        super(s, h);
        this.breed=b;
    }
    public void getBreed(){
        System.out.println("Breed = "+breed);
    }
    public void setBreed(String s){
        this.breed=s;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Breed = "+breed);
    }

}


public class AnimalTest {
    public static void main(String[] args) {
        Dog d = new Dog("Buddy", true, "German");
        d.displayDetails();
    }
    
}

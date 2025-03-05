import java.util.Scanner;
import java.util.function.Consumer;

interface ObjectCreater{
    Object create(int id,String name);

}
class Student{
    private int id;
    private String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    void updateName(Consumer<String> nameUpdater){
        nameUpdater.accept(this.name);
    }
    public String toString(){
        return "id = "+id+"\n"+"name = "+name;
    }
    public void setName(String n){
        this.name=n;
    }
}





public class ObjectCreaterMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("enter id: ");
            int i = sc.nextInt();
            sc.nextLine();
            System.out.print("enter name: ");
            String s = sc.nextLine();
        ObjectCreater CustomObject = (id,nm)->{
            
            return new Student(id, nm);
        };
        Student s1 = (Student)CustomObject.create(i, s);
        System.out.println("Before Update : \n"+s1);
        Consumer<String> ch = str->{
            System.out.print("Enter which name want to update :");
            s1.setName(sc.nextLine());
        } ;
        s1.updateName(ch);

        System.out.println("After Update : \n"+s1);
    }
}

import java.util.*;
class StudentGrade{
    HashMap<String,String> students;
    Scanner s = new Scanner(System.in);
    StudentGrade(){
        this.students=new HashMap<>();

    }
    public void addStdGrade(){
        System.out.println("Enter Student name:");
        String n=s.nextLine();
        System.out.println("Enter Student Grade:");
        students.put(n, s.nextLine());
        System.out.println("Student Grade Added Succesfully...");
    }
    public void removeStdGrd(){
       
        if(students.isEmpty()){
            System.out.println("GradeBook is empty...");
            return;
        }
        System.out.println("Enter Student name to remove:");

        String name = s.nextLine();
        if (students.containsKey(name)) {
        
            students.remove(name);
        System.out.println("Student Grade Removed Succesfully...");

        }
        else{
            System.out.println("Student is not Found...");
        }
    }
}




public class StdGrdBookApp {
    public static void main(String[] args) {
       try {
        Scanner s = new Scanner(System.in);
        StudentGrade s1 = new StudentGrade();
        boolean f = true;
        while (f) {
            System.out.println("Options:");
        System.out.println("1. Add Student Grade\n"+
        "2. Remove Student Grade\n"+
        "3. Exit");

        switch (s.nextInt()) {
            case 1:s1.addStdGrade();
                
                break;
        
            case 2:s1.removeStdGrd();
            break;
            case 3: f=false;
            break;
            default:System.out.println("Invalid Option!");
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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;
import java.util.Scanner;

record Student(Integer studentId, String studentName, Double studentFees, Date dateOfAdmission) implements java.io.Serializable{
   
    public static Student getStudentObject(){
        Scanner s = new Scanner(System.in);
        try(s;) {
            System.out.println("Enter Student-Id:");
            int id = s.nextInt();
            s.nextLine();
            System.out.println("Enter Student-Name");
            String nm = s.nextLine();
            System.out.println("Enter Student-Fees");
            double f = s.nextDouble();
            s.nextLine();
            System.out.println("Enter Student Admission-Date in \"yyyy-mm-dd\"");
            Date d = Date.valueOf(s.nextLine());
            return new Student(id, nm, f, d);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
 }
 
 
 
 public class StoreObject {
    
    public static void main(String[] args) {
        try{
        System.out.println("Enter no of objects you want to store");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String path = "C:\\Users\\SAUMY\\Desktop\\JDBC\\Student.txt";

        try( FileOutputStream f1 = new FileOutputStream(path,true);
        ObjectOutputStream o1 = new ObjectOutputStream(f1);s){
        for(int i=1;i<=n;i++){
            Student s1=Student.getStudentObject();
                    
         if(s1!=null)
           o1.writeObject(s1);
        else
        System.out.println("Failed to create Student object.");
        

        }
    }
        

    }
    catch(Exception e){
        e.printStackTrace();
    }
    }
    
 }
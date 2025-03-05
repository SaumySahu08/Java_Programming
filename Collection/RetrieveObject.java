import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class RetrieveObject {
    public static void main(String[] args) {
        String path = "C:\\Users\\SAUMY\\Desktop\\JDBC\\Student.txt";
       
        
        try(FileInputStream f2 = new FileInputStream(path);
        ObjectInputStream o1 = new ObjectInputStream(f2)){
            while (true) {
                Student s1 = (Student)  o1.readObject();
                System.out.println(s1);               
            }
        }
        catch(Exception e) {
            System.out.println("Retrieving Completed...");       
            
        }
    }
}

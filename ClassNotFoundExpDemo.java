import java.util.Scanner;

public class ClassNotFoundExpDemo {
    
    public ClassNotFoundExpDemo(String cls){
        Class c1;
        
        
        try{
            c1 = Class.forName(cls);
            System.out.println("ClassLoad: "+c1.getName());
        }
        catch(ClassNotFoundException e){
            System.out.println("Class "+cls+" not found.");
            e.printStackTrace();
        }
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the class name to load:");
        String s=sc.next();
        ClassNotFoundExpDemo c2= new ClassNotFoundExpDemo(s);

    } 
}

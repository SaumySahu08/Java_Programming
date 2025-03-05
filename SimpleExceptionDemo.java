import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo {
    
 public static void main(String[] args) {
    int a, b;
    
    try{
        Scanner sc = new Scanner(System.in);
      System.out.print("Enter the first integer (a): ");
        a=sc.nextInt();
       System.out.print("Enter the second integer (b): ");
        b=sc.nextInt();
        System.out.println("You entered a = "+a+" b = "+b);
    }
    catch(InputMismatchException e){
        System.out.println("An InputMismatchException occurred.");
        System.out.println("Message: "+e.getMessage());
       
        System.out.println("String representation:\n"+e.toString());
        
        System.out.println("Stack trace:");
        e.printStackTrace();
    }
    System.out.println("main method ended");
 }   
}

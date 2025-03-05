import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        
        String s = sc.nextLine();
        
        handleException(s);
    }
   public static void handleException(String s){
        try{
            System.out.println("length: "+s.length());
            System.out.println("Converted number: "+Integer.parseInt(s));
            

        }
        catch(NullPointerException e){
            System.out.println("NullPointerException: "+e);
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException: "+e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

public class ArrayStoreExample {

    public static void storeObject(){
        Object [] s = new String [5];
        try{
            s[0]="helo";
            s[1]="helo";
            s[2]=123;
        }
        catch(ArrayStoreException e){
            System.out.println("ArrayStoreException caught: Incompatible type: java.lang.Integer cannot be stored in an array of"+e.getMessage());
        }
    
    }
    public static void main(String[] args) {
        storeObject();
    }
}
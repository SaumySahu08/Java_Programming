public class IllegalStateExceptionDemo {

    public static void main(String[] args) {
        System.out.println("Calling throwIllegalException from main method:");
        throwIllegalStateException();
    }
    static void throwIllegalStateException(){
        try{
            throw new IllegalStateException("MYException");

        }
        catch(IllegalStateException e){
            System.out.println("caught: "+e);
        }
    } 
    
}

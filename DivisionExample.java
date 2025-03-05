public class DivisionExample {
    
    public static int performDivision(int a, int b){
        if(b==0){
            throw new ArithmeticException();
        }
        return a/b;
    }
    public static void main(String[] args) {
        int a=5,b=0;

        try{
            System.out.println(performDivision(a, b));
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException caught: Division by zero: dividend= "+a+" divisor= "+b);
        }
        
        
    }
    
}
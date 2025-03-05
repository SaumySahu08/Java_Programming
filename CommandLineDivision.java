public class CommandLineDivision {
    public static void main(String[] args) {
        

        try {
            if(args.length!=2){
                throw new IllegalArgumentException();
            }
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            try {
                System.out.println("Div: "+(a/b));
            } catch (ArithmeticException e) {
                System.out.println(e);
            }

        } catch (NumberFormatException e) {
           System.out.println(e);
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
        
    }    
}

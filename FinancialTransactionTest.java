class FinancialTransaction{
    public void processTransaction(String am, String ln){
        try{
            double a= Double.parseDouble(am);
            long l = Long.parseLong(ln);
            if(a<=0){
                throw new IllegalArgumentException("Transaction amount must be positive.");
            }
            System.out.println("Transaction successful: Amount Rs. "+a);
            System.out.println("transferred to account : "+l);
            
        }
        catch(NumberFormatException e){
            System.out.println("Invalid input: Please enter a valid number for transaction amount.");
        }
        catch(IllegalArgumentException e){
            System.out.println("Error processing transaction: Transaction amount must be positive.");
        }
        catch(RuntimeException e){
            System.out.println(e);
        }
    }
}


public class FinancialTransactionTest {
    public static void main(String[] args) {
        FinancialTransaction f = new FinancialTransaction();
        f.processTransaction("500", "1234567890");
    }
}

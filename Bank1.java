class Bank{
    private String bankName;
    private String bankCustomerName;
    private String bankAddress;
    private String bankIFSCCode;
    private int customerAccountNumber;
    private int currentBalance;

    public void setdetails(String bankName,String bankCustomerName,String bankAddress,String bankIFSCCode,int customerAccountNumber,int currentBalance){

        this.bankName=bankName;
        this.bankCustomerName=bankCustomerName;
        this.bankAddress=bankAddress;
        this.bankIFSCCode=bankIFSCCode;
        this.customerAccountNumber=customerAccountNumber;
        this.currentBalance=currentBalance;
    }

    public void withdraw(double amount){
        if(currentBalance<=1000){
            System.out.println("InsufficientBalance from the method.");
            return;
        }
        else if(currentBalance-amount<1000){
            System.out.println("Maintain MinimumBalance ");
            return;
        }
        else{
            System.out.println("Transaction Successful.");
            System.out.println("Available Balance : Rs."+(currentBalance-amount));
            currentBalance=(int)(currentBalance-amount);
        }
    }

    public void deposit(double amount){
        currentBalance=(int)(currentBalance+amount);
        System.out.println(" Deposited Successfully .");
        currentBalance();        

    }
    public void currentBalance(){
        System.out.println("Available balance is Rs. "+currentBalance);

    }
    public String displayDetails(){
        String s ="";
        s=s+bankName+" "+bankAddress+" "+bankIFSCCode+" "+bankCustomerName+" "+customerAccountNumber+" "+currentBalance;
        return s;

    }

}



public class Bank1 {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.setdetails("SBI", "Sahu", "Bus Stand", "SBIN00017107", 359970, 1200);
        b.withdraw(200);
        b.deposit(1000);
        b.currentBalance();
        String s=b.displayDetails();
        System.out.println(s);


    }
    
}

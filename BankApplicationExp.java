import java.util.Scanner;

class InsufficientFundsException extends Exception{
    InsufficientFundsException(String s){
        super(s);
    }
}
class InvalidAmountException extends RuntimeException{
    InvalidAmountException(String s){
        super(s);
    }
}

class AccountNotFoundException extends Exception{
    AccountNotFoundException(String s){
        super(s);
    }
}
class LoanNotAllowedException extends RuntimeException{
    LoanNotAllowedException(String s){
        super(s);
    }
}

interface Bank{
    void deposit(double amount) throws InvalidAmountException;
    void withdraw(double amount) throws InsufficientFundsException,InvalidAmountException;
    void transfer(BankAccount toAccount, double amount)throws InsufficientFundsException, AccountNotFoundException,InvalidAmountException;
    void applyForLoan(double amount) ;
    double getBalance();
}
class BankAccount implements Bank{
    private long accountNumber;
    private double balance;
    BankAccount(long a,double b){
        this.accountNumber=a;
        this.balance=b;
    }

    @Override
    public void deposit(double amount) throws InvalidAmountException{
        if(amount<=0){
            throw new InvalidAmountException("Amount should be greater than zero or non negative.");
        }
        this.balance=this.balance+amount;
    }
    @Override
    public void withdraw(double amount) throws InsufficientFundsException,InvalidAmountException{
        if(amount<=0){
            throw new InvalidAmountException("Amount should be greater than zero or non negative.");
        }
        if(amount>this.balance){
            throw new InsufficientFundsException("Balance is not sufficient.");
        }
        this.balance=this.balance-amount;
    }
    @Override
    public void transfer(BankAccount toAccount,double amount) throws InsufficientFundsException, AccountNotFoundException,InvalidAmountException{
        
        if(toAccount==null){
            throw new AccountNotFoundException("Account not found please provide valid account");
            
        }
        this.withdraw(amount);
        toAccount.balance=toAccount.balance+amount;
    }
    @Override
    public void applyForLoan(double amount) {
        if(this.balance<amount){
            throw new LoanNotAllowedException("Loan amount exceeds the allowed limit\nYou are not eligible for loan.");

        }
        if(amount<=0){
            throw new InvalidAmountException("Amount should be greater than zero or non negative.");
        }
        this.balance=this.balance+amount;
    }
    @Override
    public double getBalance(){
        return this.balance;
    }
    @Override
    public String toString(){
        return "[ AccountNumber: "+accountNumber+" Balance: "+balance+"]";
    }
}

class Customer  {
    private String name;
    private BankAccount account;
    Customer(String name, BankAccount account){
        this.name=name;
        this.account=account;
    }
    public BankAccount geAccount(){
        return this.account;
    }
        

    
}


public class BankApplicationExp {
    public static void main(String[] args) {
        System.out.println("Select an option :");
        System.out.println("1. Deposit \n2. Withdraw\n3. Transfer\n4. Loan Application\n5. Check Balance\n6. Exit");
        Scanner sc = new Scanner(System.in);
        BankAccount b1=new BankAccount(12345, 1000);
        BankAccount b2=new BankAccount(12356, 2000);
        Customer c1=new Customer("Saumy", b1);
        Customer c2 = new Customer("Sudeep", b2);
        try(sc){
            System.out.print("Enter your option : ");
            int o=sc.nextInt();
            switch (o) {
                case 1:System.out.print("Enter amount to deposit: ");
                int am=sc.nextInt();
                c1.geAccount().deposit(am);
                System.out.println("Balance is increased by "+am+" Balance is: "+c1.geAccount().getBalance());
                                 
                    break;

                case 2: System.out.print("Enter amount to withdraw: ");
                 am=sc.nextInt();
                c1.geAccount().withdraw(am);
                System.out.println("Withdrawl Completed");
                System.out.println("Your remaining Balance is: "+c1.geAccount().getBalance());

                break;

                case 3:c1.geAccount().transfer(c2.geAccount(), 400);
                System.out.println("Transfer successfull.");
                System.out.println("your current balance: "+c1.geAccount().getBalance());

                break;

                case 4:System.out.print("Enter the loan amount");
                am=sc.nextInt();
                c1.geAccount().applyForLoan(am);
                System.out.println("Allowed for loan now your balance is: "+c1.geAccount().getBalance());
                break;
                case 5:System.out.println("Your Balance is: "+c1.geAccount().getBalance());
                break;
                
            }
        }
        catch(InvalidAmountException e){
            System.out.println(e);
        }
        catch(InsufficientFundsException e){
            System.out.println(e);
        }
        catch(LoanNotAllowedException e){
            System.out.println(e);
        }
        catch(AccountNotFoundException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Thank You Have a Nice Day.");
        
    }
    
}
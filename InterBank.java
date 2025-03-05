interface  Bank {
    void depositing(double amount);    
    void withdrawing(double amount);
    void checkBalance();    
}

class SBI implements Bank{
    Customer c;
    SBI(Customer c){
        this.c=c;
    }
    @Override
    public void checkBalance() {
        System.out.println("Your Account Balance is: "+c.accountBalance);
    };
    @Override
    public void depositing(double amount) {
        if(amount<=0){
            System.out.println("Please enter Non-zero or Non-Negative Amount.");
        }
        else{
        c.accountBalance=c.accountBalance+amount;
        System.out.println("Amount "+amount+" is deposited and now your current balance is: "+c.accountBalance);
        }
    };
    @Override
    public void withdrawing(double amount) {
        if(amount<=0){
            System.out.println("Please enter Non-zero or Non-Negative Amount.");
        }
        else{
            c.accountBalance=c.accountBalance-amount;
            System.out.println("Amount "+amount+" is Withdrawed and now your current balance is: "+c.accountBalance);

        }
    };
}

class HDFC implements Bank{
    Customer c;
    HDFC(Customer c){
        this.c=c;
    }
    @Override
    public void checkBalance() {
        System.out.println("Your Account Balance is: "+c.accountBalance);
    };
    @Override
    public void depositing(double amount) {
        if(amount<=0){
            System.out.println("Please enter Non-zero or Non-Negative Amount.");
        }
        else{
        c.accountBalance=c.accountBalance+amount;
        System.out.println("Amount "+amount+" is deposited and now your current balance is: "+c.accountBalance);
        }
    };
    @Override
    public void withdrawing(double amount) {
        if(amount<=0){
            System.out.println("Please enter Non-zero or Non-Negative Amount.");
        }
        else{
            c.accountBalance=c.accountBalance-amount;
            System.out.println("Amount "+amount+" is Withdrawed and now your current balance is: "+c.accountBalance);

        }
    };
}
class ICICI implements Bank{
    Customer c;
    ICICI(Customer c){
        this.c=c;
    }
    @Override
    public void checkBalance() {
        System.out.println("Your Account Balance is: "+c.accountBalance);
    };
    @Override
    public void depositing(double amount) {
        if(amount<=0){
            System.out.println("Please enter Non-zero or Non-Negative Amount.");
        }
        else{
        c.accountBalance=c.accountBalance+amount;
        System.out.println("Amount "+amount+" is deposited and now your current balance is: "+c.accountBalance);
        }
    };
    @Override
    public void withdrawing(double amount) {
        if(amount<=0){
            System.out.println("Please enter Non-zero or Non-Negative Amount.");
        }
        else{
            c.accountBalance=c.accountBalance-amount;
            System.out.println("Amount "+amount+" is Withdrawed and now your current balance is: "+c.accountBalance);

        }
    };
}
class Customer {
    String name;
    double accountBalance;
    Customer(String s, double ac){
        this.name=s;
        this.accountBalance=ac;
    }
    public void deposit(Bank bank,double amount){
        bank.depositing(amount);
    }
    public void withdraw(Bank bank, double amount){
        bank.withdrawing(amount);
    }
    public void checkBalance(Bank bank){
        bank.checkBalance();
    }

    
}


public class InterBank {
    public static void main(String[] args) {
        Customer c1 = new Customer("Saumy ", 10000);
        Customer c2=new Customer(c1.name, c1.accountBalance);
        Bank b= new SBI(c1);
        Bank b2 = new HDFC(c2);
        
        c1.checkBalance(b);
        c1.deposit(b, 200);
        c2.checkBalance(b2);
        c2.withdraw(b2, 100);
    }
}

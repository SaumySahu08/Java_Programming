
class Bank{
    protected String bankName;
    protected String bramchName;
    protected String ifscCode;

    Bank(String bn, String br, String ic){
        this.bankName=bn;
        this.bramchName=br;
        this.ifscCode=ic;

    }
    public void withdraw(double amount){
        
    }
    public void deposit(double amount){
        

    }
    public boolean transfer(double amount,BankAccount fromAccount,BankAccount toAccount){
        return false;


    }
    public void loan(double amount,int years){


    }
}
class Axis extends Bank{
    private double interestRate;
    Axis(String bn, String br, String ic,double ir){
        this.bankName=bn;
        this.bramchName=br;
        this.ifscCode=ic;
        this.interestRate=ir;
    }
    @Override
    public void deposit(double amount) {


    }
    @Override
    public boolean transfer(double amount, BankAccount fromAccount, BankAccount toAccount) {

    };
    @Override
    public void loan(double amount, int years) {

    };
}
class ICICI extends Bank{
    private double loanLimit;
    ICICI(String bn, String br, String ic,double ll){
        this.bankName=bn;
        this.bramchName=br;
        this.ifscCode=ic;
        this.loanLimit=ll;

    }
    @Override
    public void withdraw(double amount) {};
    @Override
    public void deposit(double amount) {};
    @Override
    public boolean transfer(double amount, BankAccount fromAccount, BankAccount toAccount) {return false;};
    @Override
    public void loan(double amount, int years) {};
}
class SBI extends Bank{
    private double minimumBalance;
    SBI(String bn, String br, String ic,double mb){
        this.bankName=bn;
        this.bramchName=br;
        this.ifscCode=ic;
        this.minimumBalance=mb;
    } 
    @Override
    public void withdraw(double amount) {};
    @Override
    public void deposit(double amount) {};
    @Override
    public boolean transfer(double amount, BankAccount fromAccount, BankAccount toAccount) {return false;};
    @Override
    public void loan(double amount, int years) {};

}
class Customer{
    private int customerId;
    private String name;
    private String address;
    private String phoneNumber;
    private BankAccount bankAccount;

    Customer(int cid, String nm,String ad,String pn,BankAccount bankAccount){
        this.customerId=cid;
        this.name=nm;
        this.address=ad;
        this.phoneNumber=pn;
        this.bankAccount=bankAccount;
    }

    public void openAccount(Bank bank,double initialDeposit){

    }
    public void closeAccount(){

    }
    public BankAccount getBankAccount(){

    }
    public double checkBalance(){

    } 



}

class BankAccount{
    private int accountNumber;
    private double balance;
    private Bank bank;
}
BankAccount(Bank bank, double initialDeposit){
    this.bank=bank;
    this.balance=initialDeposit;
}
public int getAccountNumber(){
    return accountNumber;
}
public double getBalance() {
    return balance;
}
public setBalance(double amount){
    this.balance=amount;
}
public void withdraw(double amount, ATM atm){


}
public void deposit (double amount){

}
public void deposit(double amount, ATM atm){

}
public boolean transfer(double amount, BankAccount toAccount){
    
}
public boolean transfer(double amount, BankAccount toAccount, ATM atm){
    return false;

}
public double checkBalance(){

}

class ATM{
    public static void withdraw(BankAccount account, double amount){

    } 
    public static void deposit(BankAccount account, double amount){

    }
    public static void transfer(BankAccount fromAccount, BankAccount toAccount, double amount){

    }
}





public class BankTest {
    
}

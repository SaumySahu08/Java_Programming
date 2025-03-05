class Account{
    private int balance=0;

    public  synchronized void withdraw(int amount){
        while(balance<amount){
            System.out.println("waiting for deposit");
            try {
                wait();
            } catch (InterruptedException e) {
                
            }
           
        }
        balance=balance-amount;
        System.out.println("Withdrawed "+amount);

        System.out.println("updated balace "+balance);
        notify();
    }
    public  synchronized void deposit(int amount){
        if(amount<=0){
            throw new IllegalArgumentException("Number should be non zero or positive");
        }
        balance=balance+amount;
        System.out.println("Deposited "+amount);
        System.out.println("After deposit "+balance);
        notify();
    }
}
class Drawer extends Thread{
private Account account;
Drawer(Account ac){
    this.account=ac;
}
@Override
public void run(){
    int a[] = {1000,4000,2000};
    for (int i : a) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        account.withdraw(i);
    }
}
}
class Depositor extends Thread{
    private Account account;
    Depositor(Account ac){
        this.account=ac;
    }
    @Override
public void run(){
    int a[] = {1,1,1};
    for (int i : a) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        account.deposit(i);
    }
}
}
public class ITCAtmMachine {

    public static void main(String[] args) {
        Account saumy=new Account();
        Drawer d1 = new Drawer(saumy);
        Depositor d2 =new Depositor(saumy);
        d1.start();
        d2.start();
        
    }
}
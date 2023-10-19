package Day1.Task4;
abstract class Bank {
    //we can't create object of abstract class
    private int  accountNumber;
    private String name;
    private double balance;
    private String accountType;
    public Bank(int accountNumber,String name,double balance,String accountType){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.accountType = accountType;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    //abstract method must be declared inside an abstract class
    public abstract double getInterestRate();//abstract method doesn't contain anybody
    @Override
    public String toString(){
        String s = this.accountNumber + ", " + this.name + ", " + this.balance+", "+this.accountType;
        return s;
    }
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
class SavingAccount extends Bank{
    //concrete class
    //The class which extends abstract class must implement abstract method otherwise it should also declare as abstract class
    private final int maxWithDraw = 5000;
    public SavingAccount(int accountNumber, String name, double balance) {
        super(accountNumber, name, balance,"saving");
    }
    @Override
    public double getInterestRate(){
        return 0.07;
    }

}
class CheckingAccount extends Bank{
    //concrete class
//The class which extends abstract class must implement abstract method otherwise it should also declare as abstract class
    public CheckingAccount(int accountNumber, String name, double balance) {
        super(accountNumber, name, balance,"checking");
    }
    @Override
    public double getInterestRate() {
        return 0.03;
    }
}
public class AbstractExample {
    public static void main(String[] args) {
        //abstract class reference can be used
        Bank savingAccount = new SavingAccount(63003456,"Ben Stocks",4000);
        System.out.println(savingAccount);
        System.out.println("saving Account interest rate: "+savingAccount.getInterestRate());
        Bank checkingAccount = new CheckingAccount(630030072,"Rahul Rana",56020.23);
        System.out.println(checkingAccount);
        System.out.println("Checking account interest rate: "+checkingAccount.getInterestRate());
    }
}


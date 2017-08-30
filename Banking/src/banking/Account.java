package banking;
public class Account {
    private double balance;
    
    //Constructors
    public Account(double balance){
        this.balance=balance;
    }
    
    //Methods
    public double getBalance(){
        return balance;
    }
    public boolean deposit(double amt){
        balance+=amt;
        return true;
    }
    public boolean withdraw(double amt){
        if(balance<amt){
            System.out.println("Insufficient funds");
            return false;
        }
        else{
            balance+=amt;
            return true;
        }
    }
}

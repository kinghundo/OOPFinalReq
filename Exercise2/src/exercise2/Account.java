package exercise2;
public class Account {
    private int id;
    private Customer customer;
    private double balance;
    
    //Constructors
    public Account(int id, Customer customer, double balance){
        this.id=id;
        this.customer=customer;
        this.balance=balance;
    }
    public Account(int id, String name, double balance){
        this.id=id;
        this.customer=customer;
    }
    
    //Methods
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public String toString(){
        return customer.toString()+" balance=$"+balance;
    }
    
    public String getCustomerName(){
        return customer.getName();
    }
    public String deposit(double amount){
        balance+=amount;
        return "Current balance: "+balance;
    }
    public String withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            return "Current balance: "+balance;
        }
        else{
            return "Amount withdrawn exceeds the current balance";
        }
    }
}

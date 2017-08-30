//Test transferTo!
package exercise1;
public class Account {
    private String id;
    private String name;
    private int balance=0;
    
    //Constructor
    public Account(String id){
        this.id=id;
        balance=0;
    }
    public Account(String id, String name){
        this.id=id;
        this.name=name;
    }
    public Account(String id, String name, int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    //Methods
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public int credit(int amount){
        balance=balance+amount;
        return balance;
    }
    public int debit(int amount){
        if(amount<=balance){
            balance=balance-amount;
        }
        else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public int transferTo(Account another, int amount){
        if(amount<=balance){
            balance=balance-amount;
            another.balance+=amount;
        }
        else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public String toStringAcc(){
        return "ID: "+id+" Name: "+name+" Balance: "+balance;
    }
}

package banking;
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;
    
    //Constructor
    public Customer(String f, String l){
        firstName=f;
        lastName=l;
    }
    
    //Methods
    public String getfirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Account getAccount(){
        System.out.print(account.getBalance());
        return account;
    }
    public void setAccouunt(Account acct){
        this.account=acct;
    }
}

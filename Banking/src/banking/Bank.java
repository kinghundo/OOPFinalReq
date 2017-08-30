package banking;
public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;
    private String bankName;
    
    public Bank(String bName){
        this.bankName=bName;
    }
    public void addCustomer(String f, String l){
        Customer c1;
        c1 = new Customer(f,l);
        customers[numberOfCustomers+1]=c1;
        numberOfCustomers=numberOfCustomers+1;
    }
    public int getNumOfCustomers(){
        return numberOfCustomers;
    }
    public Customer getCustomer(int index){
        return customers[index];
    }
}

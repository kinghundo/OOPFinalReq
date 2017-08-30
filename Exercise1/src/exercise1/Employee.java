package exercise1;
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    
    //constructors
    public Employee(int id, String firstName, String lastName, int salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }
    
    //methods
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        return salary+(salary*percent);
    }
    
    public String toStringEmployee(){
        return "First Name: "+firstName+" Last Name: "+lastName+
                " ID: "+id+" Salary: "+salary;
        
    }
}

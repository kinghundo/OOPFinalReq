package exercise1;
public class Date {
    /* the following date array needs to be reviewed, too many errors
    int d;
    int m;
    private int day[]=new int[d];
    private int month[]=new int[12];
    private int year[];
    month[0]=1;
    day[0]=1;
    month[m]=m+1;
    day[int i]=i+1;
    if(month[m]=1|3|5|7|8|10|12){
        d=31;
    }
    else if(month[m]=2){
        d=28;
    }
    else{
        d=30;
    }
    */
    private int day;
    private int month;
    private int year;
    
    //Constructor
    public Date(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    //Methods
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setDate(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    
    public String toStringDate(){
        if(month<10){
            if(day<10){
                return "0"+day+"/"+"0"+month+"/"+year;
            }
            else{
                return day+"/"+"0"+month+"/"+year;
            }
        }
        else{
            if(day<10){
                return "0"+day+"/"+month+"/"+year;
            }
            else{
                return day+"/"+month+"/"+year;
            }
        }
    }
    
}

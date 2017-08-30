package exercise1;
public class Time {
    //instance variables need to be converted to be arrays
    private int hour;
    private int minute;
    private int second;
    
    //Constructor
    public Time(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    //Methods
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public String toStringTime(){
        if(hour<10){
            if(minute<10){
                if(second<10){
                    return "0"+hour+":0"+minute+":0"+second;
                }
                else{
                    return "0"+hour+":0"+minute+":"+second;
                }
            }
            else{
                if(second<10){
                    return "0"+hour+":"+minute+":0"+second;
                }
                else{
                    return "0"+hour+":"+minute+":"+second;
                }
            }
        }
        else{
            if(minute<10){
                if(second<10){
                    return hour+":0"+minute+":0"+second;
                }
                else{
                    return hour+":0"+minute+":"+second;
                }
            }
            else{
                if(second<10){
                    return hour+":"+minute+":0"+second;
                }
                else{
                    return hour+":"+minute+":"+second;
                }
            }
        }
    }
    
    /* Not Done, the method data type "Time" is confusing
    public String Time nextSecond(){
        if(minute<59){
            if(second<59){
                return "Hour: "+hour+" Minute: "+minute+" Second: "+(second+1);
            }
            else{
                return "Hour: "+hour+" Minute: "+(minute+1)+" Second: "+0;
            }
        }
        else{
            if(second<59){
                return "Hour: "+hour+" Minute: "+minute+" Second: "+(second+1);
            }
            else{
                return "Hour: "+(hour+1)+" Minute: "+0+" Second: "+0;
            }
        }
    }
    */
}

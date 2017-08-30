package exercise3;
public class MyTime {
    private int hour;
    private int minute;
    private int second;
    
    //Constructor
    public MyTime(){
        
    }
    public MyTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

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
    
    public String toString(){
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
    private MyTime nextSecond(){
        int nextSecond;
        if(this.second<59){
            nextSecond=this.second+1;
        }
        else{
            nextSecond=0;
        }
        return this;
    }
    private MyTime nextMinute(){
        int nextMinute;
        if(this.minute<59){
            nextMinute=this.minute+1;
        }
        else{
            nextMinute=0;
        }
        return this;
    }
    private MyTime nextHour(){
        int nextHour;
        if(this.hour<24){
            nextHour=this.hour+1;
        }
        else{
            nextHour=0;
        }
        return this;
    }
    private MyTime prevSecond(){
        int prevSecond;
        if(this.second>0){
            prevSecond=this.second-1;
        }
        else{
            prevSecond=59;
        }
        return this;
    }
    private MyTime prevMinute(){
        int prevMinute;
        if(this.minute>0){
            prevMinute=this.minute-1;
        }
        else{
            prevMinute=59;
        }
        return this;
    }
    private MyTime prevHour(){
        int prevHour;
        if(this.hour>0){
            prevHour=this.hour-1;
        }
        else{
            prevHour=23;
        }
        return this;
    }
}

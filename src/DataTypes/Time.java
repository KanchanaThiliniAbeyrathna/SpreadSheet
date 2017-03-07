
package DataTypes;

public class Time extends DataTypes{
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
    }
    
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public Time(String value) {
        
        String arr[] = value.split(":");
        
        hours = Integer.parseInt(arr[0]);
        minutes = Integer.parseInt(arr[1]);
        seconds = Integer.parseInt(arr[2]);
        
    }
    
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public String get_datatype(String s) {
        super.get_datatype(s); 
        return "time";
        
    }      
}


package DataTypes;

public class Dates extends DataTypes{
    
    private int year;
    private int month;
    private int day;

    public Dates() {
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
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
    

    public Dates(String value) {
        
        String arr[] = value.split("/");
        
        year = Integer.parseInt(arr[0]);
        month = Integer.parseInt(arr[1]);
        day = Integer.parseInt(arr[2]);
        
    }
    
    public Dates(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String get_datatype(String s) {
        super.get_datatype(s); 
        return "date";
    }
    
   
}


package DataTypes;


public class Number extends DataTypes{
    
    private double num;

    public Number() {
   
    }

    public Number(String value) {
        num=Double.parseDouble(value);
    }

    public double getNum() {
        return num;
    }
    

    public void setNum(double num) {
        this.num = num;
    }

    @Override
    public String get_datatype(String s) {
        super.get_datatype(s);
        return "number";
        
    }
}
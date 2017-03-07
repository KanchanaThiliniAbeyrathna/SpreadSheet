
package DataTypes;

public class Currency extends DataTypes{
    
    private String type;
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Currency() {
    }
    
    public Currency(String value) {
        String arr[]=value.split("-");
        type=arr[0];
        amount=Double.parseDouble(arr[1]);
    }

    public Currency(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String get_datatype(String s) {
        super.get_datatype(s); 
        return "currency";
        
    }
    
    

}

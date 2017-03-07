
package DataTypes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class StringParser {

    public DataTypes GetDataTypes(String string) {

        DataTypes x = null ;
        
        if(ifNumber(string)){
            x=new Number() ;
        }
        else if(ifDate(string)){
            x=new Dates();
        }
        else if(ifTime(string)){
            x=new Time();
        }
        else if(ifText(string)){
            x=new Text();
        }
        else if(ifCurrency(string)){
            x=new Currency();
        }
        
        return x;
    }

    private boolean ifCurrency(String string) {
        int i;
        String type, amount = null;
        for (i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '-') {
                type = string.substring(0, i);
                amount = string.substring(i + 1, string.length());
                break;
            }
        }
        try {
            Double.parseDouble(amount);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private boolean ifNumber(String string) {
        try {
            Double.parseDouble(string);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private boolean ifText(String string) {

        if (string.matches("[a-zA-Z]+")) {
            return true;
        }
        return false;
    }

    private boolean ifDate(String string) {
        SimpleDateFormat dayFormat = new SimpleDateFormat("dd/mm/yyyy");
        dayFormat.setLenient(false);
        try {
            Date day = dayFormat.parse(string);

        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    private boolean ifTime(String string) {
        SimpleDateFormat dayFormat = new SimpleDateFormat("hh:mm:ss");
        dayFormat.setLenient(false);
        try {
            Date day = dayFormat.parse(string);

        } catch (ParseException e) {
            return false;
        }
        return true;
    }
    
    private boolean checkCurrency(String currency) {
        if (currency.startsWith("$")) {
            String value = currency.replaceAll("\\D+", "");
            if (ifNumber(value)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean checkValue(ArrayList list) {
        int totalNumbers = 0;
        int totalText = 0;
        int totalTime = 0;
        int totalDate = 0;
        int totalCurrency =0;
        boolean isCorrect = false;
        
        for (int i = 0; i < list.size(); i++) {
            if (ifNumber((String) list.get(i))) {
                totalNumbers++;
            } else if (checkCurrency((String) list.get(i))) {
                totalCurrency++;
            } else if (ifTime((String) list.get(i))) {
                totalTime++;
            } else if (ifDate((String) list.get(i))) {
                totalDate++;
            }else{
                totalText++;
            }
        }
        
        if(totalNumbers==list.size() || totalNumbers+totalCurrency==list.size() || totalDate==list.size() || totalText==list.size() || totalCurrency==list.size() || totalTime==list.size()){
            isCorrect = true;
        }
        System.out.println(isCorrect);
        return isCorrect;
    }

}

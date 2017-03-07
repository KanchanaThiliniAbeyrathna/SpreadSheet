
package DataTypes;

public class Text extends DataTypes{
    private String str;

    public Text() {
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Text(String str) {
        this.str = str;
    }
    
    public int Len(Text text){                    //find the length of string
        int length =text.str.length();
        return length;
    }
    
    public String Upper(Text text){               //Converts text to uppercase
        String new_string=text.str.toUpperCase();
        return new_string;
    }
    
    public String Lower(Text text){               //Converts text to lowercase
        String new_string=text.str.toLowerCase();
        return new_string;
    }
    
    public String Repeat(Text text,int times){      //Repeats text to a given number of times
        String new_string="";
        for (int i=0;i<times;i++){
            new_string+=text.str;
        }
        return new_string;
    }

    @Override
    public String get_datatype(String s) {
        super.get_datatype(s); 
        return "text";
    }
    
    

}


package DataTypes;

import java.util.ArrayList;

public class StringTokenizer {
    
    public String[] tokenizeString(String string){
        
        String delims = "[+]";
                
        String[] tokens = string.split(delims);     
        
        return tokens;
    }
    
    public static ArrayList torkenize(String s){
        ArrayList arrayList = new ArrayList();
        String[] list = s.split("[-+*=()^]");
        for(int i=0;i<list.length;i++){
            if(!list[i].equals("")){
                arrayList.add(list[i]);
            }
        }
        return arrayList;
    }
}

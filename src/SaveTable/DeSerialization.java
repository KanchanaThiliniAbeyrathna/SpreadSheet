
package SaveTable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import javax.swing.JTable;

public class DeSerialization implements Serializable{
    private static final long serialVersionUID = 1L;

    public DeSerialization(Object[][] ob, JTable table) {
        try{ 
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.ser"))) {
                ob = (Object[][])in.readObject();
            }

        }catch(  ClassNotFoundException | IOException e){
            e.printStackTrace();
        }
        
        for ( int row=0 ; row < ob.length ; row++ ){
           for ( int col =1 ; col < ob[0].length ; col++ ){
               if (ob[row][col] != null ){
                   table.getModel().setValueAt(ob[row][col], row, col);
               }else {
                   table.getModel().setValueAt(null, row, col);
               }
           }
        }
        
    }
    
}

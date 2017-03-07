
package SaveTable;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class ExcelExporter {

    public void exportTable(JTable table,File file) throws IOException{
    
        try{
            TableModel model = table.getModel();
            try (FileWriter excel = new FileWriter(file)) {

                for(int i=0; i< model.getRowCount(); i++) {
                    for(int j=1; j < model.getColumnCount(); j++) {
                        if(model.getValueAt(i,j)!=null){
                            excel.write(model.getValueAt(i,j).toString()+"\t");  
                        }else{
                            excel.write("\t");
                        }
                    }
                    excel.write("\n");
                }
            }

        }catch(  IOException | NullPointerException e ){ 
            System.out.println(e);
        }
    }
    
}


package SaveTable;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable{
    private static final long serialVersionUID = 1L;

    public Serialization(Object[][] ob) {
         try {
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("f.ser"))) {
                out.writeObject(ob);
                out.flush();
            }

        }catch (IOException i) {
            i.printStackTrace();
        }

        System.out.println("\ncell contents serailized successfully \n");   
    }
   
}

package guiluggage;

import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.UIManager;

/**
 *
 * @author groep 4
 */
public class GuiLuggage {
   // private static final ResourceBundle translation = ResourceBundle.getBundle("guiluggage/translation");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale english, dutch, current;
        
        english = new Locale("en", "US");
        dutch = new Locale("nl", "NL");
        
        Locale.setDefault(dutch);
        
        current = Locale.getDefault();
        System.out.println("Current language: "+current.toString());
        
        logIn login = new logIn();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        
        try{
            UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}

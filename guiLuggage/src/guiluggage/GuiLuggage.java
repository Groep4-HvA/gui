package guiluggage;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author groep 4
 */
public class GuiLuggage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale currentLocale;
        ResourceBundle messages;
        String language;
        String country;
        
//        if (args.length != 2) {
            language = "en";
            country = "US";
//        } else {
//            language = args[0];
//            country = args[1];
//        }
//      MainGuiFrame main = new MainGuiFrame();
        
        logIn login = new logIn();
        currentLocale = new Locale(language, country);
                
//      messages = ResourceBundle.getBundle("translation", currentLocale);
//      main.setName(messages.getString("greetings"));
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        
    }
}

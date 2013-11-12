package guiluggage;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author groep 4
 */
public class GuiLuggage {
    private static final ResourceBundle translation = ResourceBundle.getBundle("guiluggage/translation");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale currentLocale;
        ResourceBundle messages;
        String language;
        String country;
        
//        if (args.length != 2) {
//            language = translation.getString("EN");
//            country = translation.getString("US");
//        } else {
//            language = args[0];
//            country = args[1];
//        }
        
        logIn login = new logIn();
//        currentLocale = new Locale(language, country);
//                
//        messages = ResourceBundle.getBundle("translation", currentLocale);
//        System.out.print(messages.getString("greetings"));
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        
    }
}

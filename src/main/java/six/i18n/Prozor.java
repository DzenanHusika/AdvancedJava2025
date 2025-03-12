package six.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class Prozor {
    public static void main(String[] args) {
        ResourceBundle resourceBundle = getResource(args);
    }

    private static ResourceBundle getResource(String[] args){
        String language;
        String country;
        if (args.length!=2){
            language = "en";
            country = "us";
        }else{
            language = args[0];
            country = args[1];
        }
        ResourceBundle resourceBundle = getResource(language, country);
        return getResource(language, country);
    }

    private static ResourceBundle getResource(String language, String country){
        Locale currentLocale = new Locale(language,country);
        return ResourceBundle.getBundle("messages", currentLocale);
    }
}

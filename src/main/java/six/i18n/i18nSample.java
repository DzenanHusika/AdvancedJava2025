package six.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class i18nSample {
    public static void main(String[] args) {
        String language;
        String country;
        if (args.length!=2){
            language = "en";
            country = "us";
        }else{
           language = args[0];
            country = args[1];
        }

        Locale currentLocale = new Locale(language, country);

        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", currentLocale);
        System.out.println(resourceBundle.getString("greetings"));
        System.out.println(resourceBundle.getString("introduceMySelf"));
    }
}

package lab.session5;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageBundleDemo {
    public static void main(String[] args) {
        Locale locale = null;
        ResourceBundle resource = null;
        
        locale = new Locale("en", "US");
        resource = ResourceBundle.getBundle("lab/session5/MessageBundle", locale);
        System.out.println(resource.getString("HELLO_MSG"));
        System.out.println(resource.getString("GOODBYE_MSG"));
        
        locale = new Locale("zh", "TW");
        resource = ResourceBundle.getBundle("lab/session5/MessageBundle", locale);
        System.out.println(resource.getString("HELLO_MSG"));
        System.out.println(resource.getString("GOODBYE_MSG"));
    }
}

package book.java7.chapter9;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageBundleDemo {
    public static void main(String[] args) {        
        show(new Locale("zh", "TW"));
        show(new Locale("en", "US"));        
    }
    private static void show(Locale locale) {
        ResourceBundle resource =  ResourceBundle.getBundle(""
                + "book/java7/chapter9/MessageBundle", locale);
        System.out.println(resource.getString("HELLO_MSG"));
        System.out.println(resource.getString("GOODBYE_MSG"));
    }
}

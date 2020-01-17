package book.java7.chapter9;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
public class Ex_DateFormat {
    private static Date date = new Date();
    public static void main(String[] args) {
        show(DateFormat.SHORT, DateFormat.SHORT, Locale.TAIWAN);
        show(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.TAIWAN);
        show(DateFormat.LONG, DateFormat.LONG, Locale.TAIWAN);
        show(DateFormat.FULL, DateFormat.FULL, Locale.TAIWAN);
    }
    private static void show(int dateFormat, int timeFormat,
                                  Locale locale) {
        DateFormat df = DateFormat.getDateTimeInstance(dateFormat,
                          timeFormat, locale);
        System.out.println(df.format(date));
    }
}

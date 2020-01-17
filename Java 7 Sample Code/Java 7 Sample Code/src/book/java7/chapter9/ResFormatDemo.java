package book.java7.chapter9;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class ResFormatDemo {
    public static void main(String[] args) {
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.DEFAULT, 
                Locale.TAIWAN);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.DEFAULT, 
                Locale.US);
        System.out.println("Taiwan:\t" + df1.format(new Date()));
        System.out.println("US:\t" + df2.format(new Date()));
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.TAIWAN);
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.ITALY);
        System.out.println("Taiwan:\t" + nf1.format(15000.45));
        System.out.println("Italy:\t" + nf2.format(15000.45));
    }
}

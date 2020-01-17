package lab.session5;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class NumberFormatDemo {
    public static void main(String[] args) {
        //NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.ITALY);
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.TAIWAN);
        System.out.println(nf.format(88000.00));
    }    
}

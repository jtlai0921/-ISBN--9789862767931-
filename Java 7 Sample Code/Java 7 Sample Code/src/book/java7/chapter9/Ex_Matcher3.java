package book.java7.chapter9; 
import java.util.regex.*;
public class Ex_Matcher3 {
    public static void main(String[] args) {
        String str = "How many cake could a good cook cook " +
                       "If a good cook could cook cake? A " +
                       "good cook could cook as much cake " +
                       "as a good cook who could cook cake.";
        Pattern ptn = Pattern.compile("cake",
                                      Pattern.CASE_INSENSITIVE);
        Matcher mch = ptn.matcher(str);
        String newStr = mch.replaceAll("pies");
        System.out.println(newStr);
    }
}

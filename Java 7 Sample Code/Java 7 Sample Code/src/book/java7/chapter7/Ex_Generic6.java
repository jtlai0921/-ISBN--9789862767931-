package book.java7.chapter7;
import java.util.*;
public class Ex_Generic6 {
    public static void main(String[] args) {
        Vector<String> v = getMyVector();
        Iterator<String> it = v.iterator();
        while(it.hasNext()) {
            String data = it.next();
            System.out.print(data + ", ");
        }
        System.out.println();
    }
    static Vector<String> getMyVector() {
        Vector<String> v = new Vector<>();
        v.add("Java");
        v.add("Tiger");
        v.add("SCJP");
        return v;
    }
}

package book.java7.chapter7; 
import java.util.*;
public class Ex_HashSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("SCJP");
        hs.add("SCWCD");
        hs.add("SCBCD");
        hs.add("SCMCD");
        Iterator it = hs.iterator();
        while(it.hasNext()){
            String data = (String)it.next();
            System.out.print(data + ", ");
        }
    }
}

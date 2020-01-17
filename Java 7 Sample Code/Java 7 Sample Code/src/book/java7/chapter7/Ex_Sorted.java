package book.java7.chapter7;
import java.util.*;
public class Ex_Sorted {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("CCC");
        v.add("BBB");
        v.add("AAA");
        v.add("DDD");
        System.out.println("排序前 : " + v.toString());
        Collections.sort(v);
        System.out.println("排序後 : " + v.toString());
    }
}


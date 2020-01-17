package book.java7.chapter7; 
import java.util.*;
public class Ex_HashMap {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("A", "SCJP");
        map.put(100, 100);
        map.put(new Object(), "SCBCD");
        map.put(null, null);
        System.out.println(map.toString());
        System.out.println("key=A : " + map.get("A"));
        System.out.println("key=B : " + map.get("B"));
    }
}


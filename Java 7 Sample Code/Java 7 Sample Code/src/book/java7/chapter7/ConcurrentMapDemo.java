package book.java7.chapter7;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapDemo {
    public static void main(String[] args) {
        ConcurrentMap <String, String> partListA = new ConcurrentHashMap<>();
        partListA.put("key","Red Shirt");
        partListA.put("key","Blue Shirt");
        System.out.println("partListA:" + partListA);
        
        ConcurrentMap <String, String> partListB = new ConcurrentHashMap<>();
        partListB.putIfAbsent("key","Red Shirt");
        partListB.putIfAbsent("key","Blue Shirt");
        System.out.println("partListB:" + partListB);        
    }
}

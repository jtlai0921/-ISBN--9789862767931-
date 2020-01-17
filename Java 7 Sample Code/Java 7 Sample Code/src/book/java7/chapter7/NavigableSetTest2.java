package book.java7.chapter7;
import java.util.*;

public class NavigableSetTest2 {
    public static void main(String[] args) {
        MyNavigableSet obj = new MyNavigableSet();
        obj.add("Hello Java");
        System.out.println(obj);
    }
}

class MyNavigableSet extends TreeSet<String> {
    public boolean add(String value) {
        return super.add(value);
    }
}

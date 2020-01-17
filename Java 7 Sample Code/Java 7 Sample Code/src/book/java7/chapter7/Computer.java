package book.java7.chapter7;
import java.util.*;
public class Computer<A> {
    private Vector<A> v;
    public Computer() {
        v = new Vector<A>();
    }
    public void add(A o) {
        v.add(o);
    }
    public int size() {
        return v.size();
    }
}

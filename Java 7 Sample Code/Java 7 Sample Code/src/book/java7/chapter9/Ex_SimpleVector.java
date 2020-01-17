package book.java7.chapter9; 
import java.util.*;
public class Ex_SimpleVector {
    public static void main(String[] args) {
        // 一個沒有被泛化的 Vector
        Vector vector = new Vector();
        // 一個有被泛化的 Vector
        //Vector<Object> vector = new Vector<Object>();
        vector.add(100);
        vector.add(20.5);
        vector.add("Java");
    }
}

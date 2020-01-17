package book.java7.chapter9;

import java.util.ArrayList;
import java.util.List;

public class MyUtils {
    @SafeVarargs
    public static <T> void add(T... x) {
        // do something !
    }
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        MyUtils.<List<Integer>>add(x, y);
    }
}

package book.java7.chapter7;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest1 {

    public static void main(String[] args) {
        NavigableSet<Integer> ns = new TreeSet<>();
        ns.add(2);
        ns.add(3);
        ns.add(1);
        ns.add(5);
        ns.add(4);
        System.out.println("預設自然排序:" + ns);
        System.out.println("倒序:" + ns.descendingSet());
        System.out.println("第一個元素:" + ns.first());
        System.out.println("最後一個元素:" + ns.last());
        System.out.println("小於 3 之最大元素:" + ns.lower(3));
        System.out.println("小於等於 3 之最大元素:" + ns.floor(3));
        System.out.println("大於 2 之最小元素:" + ns.higher(2));
        System.out.println("大於等於 2 之最小元素:" + ns.ceiling(2));
    }
}

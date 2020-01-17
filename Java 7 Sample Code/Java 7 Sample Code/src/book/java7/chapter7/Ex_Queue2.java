package book.java7.chapter7;
import java.util.*;
public class Ex_Queue2 {
    public static void main(String[] args) {
        Queue q1 = new LinkedList();
        q1.offer("Java");

        Queue q2 = new LinkedList();
        q2.offer("Java");

        System.out.println(q1.poll());
        System.out.println(q1.toString());
        System.out.println();
        System.out.println(q2.peek());
        System.out.println(q2.toString());
    }
}


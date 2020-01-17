package book.java7.chapter3;
import java.util.*;
import static java.lang.System.*;
import org.apache.commons.lang3.builder.HashCodeBuilder;
public class HashCodeTest {
    public static void main(String[] args) {
        Ball b1 = new Ball("斯伯丁", "籃球", "紅");
        Ball b2 = new Ball("斯伯丁", "籃球", "紅");
        out.println("b1.equals(b2) = " + b1.equals(b2));
        out.println("b1.hashCode() = " + b1.hashCode());
        out.println("b2.hashCode() = " + b2.hashCode());
        HashMap h = new HashMap();
        h.put(new Ball("斯伯丁", "籃球", "紅"), "ABC");
        out.print("HashMap 元素內容 = ");
        out.println(h.get(new Ball("斯伯丁", "籃球", "紅")));
    }
}
class Ball {
    String tradeMark;
    String kind;
    String color;
    Ball(String t, String k, String c) {
        tradeMark = t;
        kind = k;
        color = c;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj != null && getClass() == obj.getClass()) {
            if(obj instanceof Ball) {
                Ball ball = (Ball)obj;
                if (tradeMark.equals(ball.tradeMark) &&
                    kind.equals(ball.kind) &&
                    color.equals(ball.color)) {
                    return true;
                }
            }
        }
        return false;
    }
    public int hashCode() {
        return new HashCodeBuilder(17, 37).
                    append(tradeMark).
                    append(kind).
                    append(color).
                    toHashCode();
    }
}

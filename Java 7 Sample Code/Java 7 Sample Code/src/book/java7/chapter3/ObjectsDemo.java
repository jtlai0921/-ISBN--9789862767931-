package book.java7.chapter3;
import java.util.Objects;
import static java.lang.System.out;

class NewBall {
    String tradeMark;
    String kind;
    String color;
    NewBall(String t, String k, String c) {
        tradeMark = t;
        kind = k;
        color = c;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            if (obj instanceof NewBall) {
                NewBall ball = (NewBall) obj;
                return Objects.equals(tradeMark, ball.tradeMark)
                        & Objects.equals(kind, ball.kind)
                        & Objects.equals(color, ball.color);
            }
        }
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(tradeMark, kind, color);
    }
    @Override
    public String toString() {
        return "{tradeMark:" + tradeMark + ", kind:" + kind + ", color=" + color + "}";
    }
}

public class ObjectsDemo {
    public static void main(String[] args) {
        NewBall b1 = new NewBall("斯伯丁", "籃球", "紅");
        NewBall b2 = new NewBall("斯伯丁", "籃球", "紅");
        NewBall b3 = null;
        // toString()
        out.println("b1:" + Objects.toString(b1, "I'm NULL"));
        out.println("b2:" + Objects.toString(b2, "I'm NULL"));
        out.println("b3:" + Objects.toString(b3, "I'm NULL"));
        // equals() and hashCode()
        out.println("b1.equals(b2) = " + b1.equals(b2));
        out.println("b1.hashCode() = " + b1.hashCode());
        out.println("b2.hashCode() = " + b2.hashCode());
        // deepEquals()        
        NewBall[] array1 = {new NewBall("A牌", "籃球", "紅"), 
                            new NewBall("B牌", "棒球", "白")};
        NewBall[] array2 = {new NewBall("A牌", "籃球", "紅"), 
                            new NewBall("B牌", "棒球", "白")};
        System.out.print(Objects.equals(array1, array2) + "\t");
        System.out.println(Objects.deepEquals(array1, array2));
    }
}

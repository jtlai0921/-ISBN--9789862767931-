package book.java7.chapter9;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@interface Copyright4 {
    String value();
}

@Copyright4("www.foo.com 7.0, 2013/4/3")
class Animal4 {
    
}

public class TesterByAnimal {
    public static void main(String[] args) {
        try {
            Class c4 = Class.forName("book.java7.chapter9.Animal4");
            if (c4.isAnnotationPresent(Copyright4.class)) {
                Copyright4 copyright4 =
                        (Copyright4) c4.getAnnotation(Copyright4.class);
                System.out.println(copyright4.value());
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}

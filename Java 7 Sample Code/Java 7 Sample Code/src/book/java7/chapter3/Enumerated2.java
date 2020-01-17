package book.java7.chapter3;
enum Grade {A{
                    public String toString() {
                        return "Great";
                    }
                }, B, C, D}
public class Enumerated2 {
    public static void main(String[] args) {
        System.out.println(Grade.B);
        System.out.println(Grade.A);
    }
}

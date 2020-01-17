package book.java7.chapter9;
public class Ex_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append("SCJP").append("7.0");
        System.out.println("sb = " + sb);
        System.out.println("length = " + sb.length());
    }

}

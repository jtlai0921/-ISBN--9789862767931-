package book.java7.chapter9;
public class Ex_Matcher5 {
    public static void main(String[] args) {
        String str = "http://vincentjava.idv.tw";

        String[] tokens = str.split("[:/.]+");
        for(String token : tokens) {
            System.out.println(token);
        }
    }
}

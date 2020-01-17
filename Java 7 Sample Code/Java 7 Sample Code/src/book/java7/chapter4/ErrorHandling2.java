package book.java7.chapter4;
import static java.lang.System.*;
public class ErrorHandling2 {
    static int numerator = 20;  // 分子
    static int[] denominator = {0, 2, 4};  // 分母
    static String answer;  // 計算結果
    public static void main(String[] args) {
        calc(0);
        out.println(numerator + " / " + denominator[0] +
                      " = " + answer);
        calc(2);
        out.println(numerator + " / " + denominator[2] +
                      " = "  + answer);
        out.println("計算完畢 !");
    }
    public static void calc(int index) {
        double ans = 0;
        try {
            ans = numerator / denominator[index];
            answer = String.valueOf(ans);
        }
        catch(ArithmeticException e) {
            out.println("產生了數學錯誤, 原因是 : " +
                                e.getMessage());
            out.println("詳細錯誤 : ");
            e.printStackTrace(out);
            answer = "無法計算";
        }
    }
}

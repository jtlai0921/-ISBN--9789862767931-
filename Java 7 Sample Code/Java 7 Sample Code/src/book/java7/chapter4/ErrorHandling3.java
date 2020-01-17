package book.java7.chapter4;
import static java.lang.System.*;
public class ErrorHandling3 {
    static int numerator = 20;  // 分子
    static int[] denominator = {0, 2, 4};  // 分母
    static String answer;  // 計算結果
    public static void main(String[] args) {
        try {
            calc(0);
        }
        catch(Exception e) {
            out.println("錯誤訊息 : " + e.getMessage());
        }
        out.println(numerator + " / " + denominator[0] +
                    " = " + answer);
        out.println("計算完畢 !");
    }
    public static void calc(int index) throws Exception{
        double ans = 0;
        if ((index == 0) || (index >= denominator.length)) {
            answer = "無法計算";
            throw new Exception("denominator[] 的索引值" + "不得為 " + index);
        }
        ans = numerator / denominator[index];
        answer = String.valueOf(ans);
    }
}

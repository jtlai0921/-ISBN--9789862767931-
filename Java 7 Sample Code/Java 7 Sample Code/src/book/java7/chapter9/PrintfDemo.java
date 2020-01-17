package book.java7.chapter9;
import java.util.Calendar;
public class PrintfDemo {
    public static void main(String[] args) {
        // 取得日期實體
        Calendar now = java.util.Calendar.getInstance();
        System.out.println("(12) : " + now);

        // %tA 星期幾完整顯示, %ta 星期幾精簡顯示
        System.out.printf("(13) : %tA %n", now);

        // %tB 月份完整顯示, %tb 月份精簡顯示
        System.out.printf("(14) : %tB %n", now);

        // %tC 世紀
        System.out.printf("(15) : %tC 世紀 %n", now);

        // %tc 完整的時間與日期
        System.out.printf("(16) : %tc %n", now);

        // %tD 短數字的日期 例: 09/19/05 而非 2005
        System.out.printf("(17) : %tD %n", now);

        // %td 日, 從 01 ～ 31 的二位數字, 例:05
        System.out.printf("(18) : %td %n", now);

        // %te 日, 從 1 ～ 31 的二位數字(會忽略前置的 0), 例:5
        System.out.printf("(19) : %te %n", now);

        // 全部串聯
        System.out.printf("(20) : Right now is %tr on "
                + "%<tA, %<tB, %<te, %<tY. %n", now);
    }
}

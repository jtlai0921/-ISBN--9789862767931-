package book.java7.chapter8;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CallableStatement_Member {

    public static void main(String[] args) {
        // 建立callable查詢語句
        String sql = "{call APP.DRS2(?, ?)}";

        try ( // 建立 derby connection
                Connection conn = DriverManager.getConnection("jdbc:"
                        + "derby://localhost:1527/sample", "app", "app");
                // 建立 CallableStatement
                CallableStatement cs = conn.prepareCall(sql);) {
            
            cs.setInt(1, 1);
            cs.setInt(2, 3);
            
            boolean hasResults = cs.execute();

            while (hasResults) {
                ResultSet rs = cs.getResultSet();
                while (rs.next()) {
                    System.out.println(rs.getString("ID") + "\t" + 
                            rs.getString("NAME"));
                }
                rs.close();
                hasResults = cs.getMoreResults();
            }

        } catch (Exception e) {
            System.out.print(e);
        }
    }
}

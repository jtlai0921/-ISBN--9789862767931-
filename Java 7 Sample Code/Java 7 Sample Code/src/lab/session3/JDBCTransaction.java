package lab.session3;

import java.sql.*;

public class JDBCTransaction {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        
        try {
            // 建立 mssql connection
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            
            // 建立 mssql statement
            stmt = conn.createStatement();
            conn.setAutoCommit(false);
            stmt.executeUpdate("delete from APP.EMPLOYEES");
            stmt.executeUpdate("insert into APP.EMPLOYEES values(1,'Sam')");
            Savepoint point = conn.setSavepoint("point"); // RollBack回復點
            stmt.executeUpdate("insert into APP.EMPLOYEES values(2,'Jane')");
            conn.rollback(point);
            stmt.executeUpdate("insert into APP.EMPLOYEES values(3,'John')");
            conn.commit();
            ResultSet rs = stmt.executeQuery("select * from APP.EMPLOYEES");
            
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2));
            }
        } catch (Exception e) {
            System.out.print(e);
        }

    }
}

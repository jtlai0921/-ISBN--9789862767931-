package book.java7.chapter8;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementAndRowSet {    
    
    public static void main(String[] args) {        
        try(    // 建立 derby connection
                Connection conn = DriverManager.getConnection("jdbc:"
                     + "derby://localhost:1527/sample", "app", "app");
                // 建立 Statement
                Statement stmt = conn.createStatement();   
                // 建立 ResultSet  
                ResultSet rs = stmt.executeQuery("select NAME, CITY "
                        + "from APP.CUSTOMER");
           ) {            
            // 建立 derby driver instance
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            
            // 走訪 ResultSet
            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t" + rs.getString(2));
            }
            
            
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}

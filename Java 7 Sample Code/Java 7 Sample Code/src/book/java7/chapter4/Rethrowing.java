package book.java7.chapter4;
import java.io.IOException;
import java.sql.SQLException;

public class Rethrowing {
    public static void main(String[] args) {
        try {
            access();
            
        } catch (SQLException | IOException e) {
            System.out.println(e.getClass() + ":" + e.getMessage());
        } 
    }

    private static void access() throws SQLException, IOException {
        try {
            if (Math.random() < 0.5) {
                throw new SQLException("無法開啟資料庫");
            } else {
                throw new IOException("無法開啟檔案");
            }
        } catch(Exception e) {
            throw e;
        }
    }
}


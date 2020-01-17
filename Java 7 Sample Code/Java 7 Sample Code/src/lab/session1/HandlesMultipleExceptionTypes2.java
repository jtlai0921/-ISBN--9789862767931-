package lab.session1;

import java.io.*;
import java.sql.*;

public class HandlesMultipleExceptionTypes2 {

    public static void main(String[] args) {
        try {
            access();
        } catch (Exception e) { // 不可寫成 (IOException | SQLException | Exception e)
            System.out.println(e.getClass() + ":" + e.getMessage());
        }
    }

    private static void access() throws IOException, SQLException, Exception {
        if (Math.random() < 0.3) {
            throw new IOException("無法開啟檔案");
        } else if (Math.random() < 0.6) {
            throw new SQLException("無法連接資料庫");
        } else {
            throw new Exception("無法連接資源");
        }
    }
}

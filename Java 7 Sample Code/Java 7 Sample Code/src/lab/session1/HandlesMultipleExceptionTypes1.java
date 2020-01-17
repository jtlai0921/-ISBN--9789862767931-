package lab.session1;

import java.io.*;
import java.sql.*;

public class HandlesMultipleExceptionTypes1 {

    public static void main(String[] args) {
        try {
            access();
        } catch (IOException | SQLException e) {
            System.out.println(e.getClass() + ":" + e.getMessage());
        }
    }

    private static void access() throws IOException, SQLException {
        if (Math.random() < 0.5) {
            throw new IOException("無法開啟檔案");
        } else {
            throw new SQLException("無法連接資料庫");
        }
    }
}

package util;

import java.sql.DriverManager;
import java.sql.SQLException;

//import com.mysql.jdbc.Connection;
import java.sql.Connection;

public class dbUtil {
	//连接数据库
	
    public static Connection getConnect() {
        Connection conn = null;
        try {
            //加载数据库驱动
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/jdbcdemo?useUnicode=true&characterEncoding=UTF-8";
        try {
        		conn=DriverManager.getConnection(url, "root", "xxxx");
            if (conn != null) {
                System.out.println("connect init successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    //
    public static void name() {
		
	}
    //关闭数据库
    public static void closeConn(Connection conn){
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}

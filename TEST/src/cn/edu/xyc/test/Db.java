package cn.edu.xyc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
	
	
	public static Connection getconnection() {
		Connection conn = null;
		String driver = "com.mysql.jdbc.Driver";
		String username = "root";
		String password = "root";
		String url="jdbc:mysql://localhost:3306/test";
		try {
			Class.forName(driver);
			//连接数据库
			conn = DriverManager.getConnection(url, username, password);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
		

	}
	

}

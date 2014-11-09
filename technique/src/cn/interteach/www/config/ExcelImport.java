package cn.interteach.www.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ExcelImport {
public static void main(String[] args) {
	
	String driver =  "com.mysql.jdbc.Driver";
	String user = "root";
	String password = "root";
	String url ="jdbc:mysql://localhost:3306/test";
	
	try {
		Connection connection = DriverManager.getConnection(url, user, password);
		System.out.println(connection);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	try {
		Class.forName(driver);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}

}
	


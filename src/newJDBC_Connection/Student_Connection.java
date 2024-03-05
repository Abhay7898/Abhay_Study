package newJDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;

public class Student_Connection {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhay_prectices?characterEncoding=utf8", "root", "root");
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			
		}
		return con;
	}
}

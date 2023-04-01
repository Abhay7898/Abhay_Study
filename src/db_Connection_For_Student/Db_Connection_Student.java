package db_Connection_For_Student;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db_Connection_Student {
	
	public static Connection getConnetion() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_data?characterEncoding=utf8", "root","root");
		}catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
}

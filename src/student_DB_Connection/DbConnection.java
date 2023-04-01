package student_DB_Connection;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class DbConnection {

	public static Connection getConnection() {
		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student_data?characterEncoding=utf8",
					"root", "root");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;

	}

}

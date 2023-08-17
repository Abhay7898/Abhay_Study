package student_Connetion_From_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db_Connection {

	public static Connection getConnection() throws SQLException {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager
					.getConnection("jdbc:mysql://localhost:3306/student_data?characterEncoding=utf8", "root", "root");
		} catch (Exception e) {
			System.out.println(e);
		}finally {
		}
		return con;
	}

}

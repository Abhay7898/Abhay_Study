package newJDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Opretion_Class {
	public static void main(String[] args) throws SQLException{
		Connection con = Student_Connection.getConnection();
		PreparedStatement ps =con.prepareStatement("select*from student");
		ResultSet rs =ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
		}
	}
}

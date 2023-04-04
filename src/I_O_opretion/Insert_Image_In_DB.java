package I_O_opretion;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import student_DB_Connection.DbConnection;

public class Insert_Image_In_DB {
	public static void main(String[] args) {
		Connection con = DbConnection.getConnection();
		try {
			PreparedStatement ps =con.prepareStatement("insert into image1 value (?,?)");
			FileInputStream fi = new FileInputStream("D://Dog.JPG");
			ps.setInt(1, 2);
			ps.setBinaryStream(2, fi);
			int  a =ps.executeUpdate();
			if(a>0) {
				System.out.println("Image inserted");
			}
			else {
				System.out.println("Image not inserted");
			}
			//System.out.println(a);
		}catch (SQLException|IOException e) {
       System.out.println(e);
		}
	}

}

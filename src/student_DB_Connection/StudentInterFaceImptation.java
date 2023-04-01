package student_DB_Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentInterFaceImptation implements StudentInterFace {

	Connection con = DbConnection.getConnection();

	@Override
	public List<Student> readAllStudent() throws SQLException {
		List<Student> list = new ArrayList<>();

		PreparedStatement ps = con.prepareStatement("select  * from student");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Student st = new Student();
			st.setsId(rs.getInt(1));
			st.setsName(rs.getString(2));
			st.setsFather(rs.getString(3));
			st.setsMono(rs.getInt(4));
			st.setsDep(rs.getString(5));
			list.add(st);
		}
		return list;
	}

	@Override
	public Student readByStudentId(int id) throws SQLException {
		String st1 = "select  * from student where sId = ? ";
		PreparedStatement ps = con.prepareStatement(st1);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		Student st = new Student();
		while (rs.next()) {
			st.setsId(rs.getInt(1));
			st.setsName(rs.getString(2));
			st.setsFather(rs.getString(3));
			st.setsMono(rs.getInt(4));
			st.setsDep(rs.getString(5));
		}
		return st;
	}

	@Override
	public int createStudent(Student stu) {
		int insertValue = 0;
		try {
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?)");
			ps.setInt(1, stu.getsId());
			ps.setString(2, stu.getsName());
			ps.setString(3,stu.getsFather());
			ps.setInt(4, stu.getsMono());
			ps.setString(5, stu.getsDep());
			insertValue =  ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return insertValue;
	}

	@Override
	public boolean updateStudsent(Student Stu) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStudentByIdAndName(int sId, String sName) {
		
		return false;
	}

}

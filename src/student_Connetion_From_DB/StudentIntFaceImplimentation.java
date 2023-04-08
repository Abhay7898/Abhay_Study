package student_Connetion_From_DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentIntFaceImplimentation implements StudentInterFace {
	Connection con = Db_Connection.getConnection();

	public List<Student>readAllStudentadAllStudent() throws SQLException {
		List<Student> list = new ArrayList<>();
		String st = "select*from Student;";
		PreparedStatement ps = con.prepareStatement(st);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Student stu = new Student();
			stu.setSid(rs.getInt(1));
			stu.setsName(rs.getString(2));
			stu.setsFather(rs.getString(3));
			stu.setsMono(rs.getInt(4));
			stu.setsDep(rs.getString(5));
			list.add(stu);
		}
		return list;
	}

	@Override
	public Student resdStudentById(int id) throws SQLException {
		String st = "select*from student where sId=?";
		PreparedStatement ps = con.prepareStatement(st);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		Student stu = new Student();
		while (rs.next()) {
			// Student stu = new Student();
			stu.setSid(rs.getInt(1));
			stu.setsName(rs.getString(2));
			stu.setsFather(rs.getString(3));
			stu.setsMono(rs.getInt(4));
			stu.setsDep(rs.getString(5));
		}
		return stu;
	}

	@Override
	public boolean deleteStudent(int sId) {
		boolean b = false;
		try {
			PreparedStatement ps = con.prepareStatement("delete from student where sId = ?");
			ps.setInt(1, sId);
			int i = ps.executeUpdate();
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return b;
	}

	@Override
	public boolean updateStudent(Student st) {
		try {
			PreparedStatement ps = con
					.prepareStatement("UPDATE student SET sName = ?, sFather = ?, sMono = ?,  sDep = ? WHERE sId = ?");
			ps.setString(1, st.getsName());
			ps.setString(2, st.getsFather());
			ps.setInt(3, st.getsMono());
			ps.setString(4, st.getsDep());
			ps.setInt(5, st.getSid());
			int i = ps.executeUpdate();
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	@Override
	public int CreateStudent(Student st) {
		int creat = 0;
		try {
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?)");
			ps.setInt(1, st.getSid());
			ps.setString(2, st.getsName());
			ps.setString(3, st.getsFather());
			ps.setInt(4, st.getsMono());
			ps.setString(5, st.getsDep());
			creat = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return creat;
	}

	@Override
	public boolean deleteStudentByIdAndName(int id, String name) {
		// boolean b = false;
		try {
			PreparedStatement ps = con.prepareStatement(" delete from student where sId =? and sName = ?");
			ps.setInt(1, id);
			ps.setString(2, name);
			int i = ps.executeUpdate();
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
	
	@Override
	public Student  readStudentByIdAndNameAndMob(int id, String name, int mob) {
		Student st= new Student();
		try {
			PreparedStatement ps = con.prepareStatement("select *from student where sId =? and sName = ? and sMono = ?");
		    ps.setInt(1,id);
			ps.setString(2 ,name);
			ps.setInt(3, mob);
			ResultSet rs =ps.executeQuery();	
      			while(rs.next()) 
			{
				st.setSid(rs.getInt(1));
				st.setsName(rs.getString(2));
				st.setsFather(rs.getString(3));
				st.setsMono(rs.getInt(4));
				st.setsDep(rs.getString(5));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return st;
	}

	@Override
	public List<Student> readAllStudent() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}

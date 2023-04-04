package db_Connection_For_Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Student_InterFace_Implimention implements StudentInterFace {
	Connection con = Db_Connection_Student.getConnetion();

	@Override
	public List<Student> readAllStudent() throws SQLException {
		PreparedStatement ps = con.prepareStatement("select* from student");
		ResultSet rs = ps.executeQuery();
		List<Student> list = new ArrayList<>();
		while (rs.next()) {
			Student st = new Student();
			st.setsId(rs.getInt(1));
			st.setsName(rs.getString(2));
			st.setsFather(rs.getString(3));
			st.setSmob(rs.getInt(4));
			st.setsDep(rs.getString(5));
			list.add(st);
		}
		return list;
	}

	@Override
	public Student readStudentById(int sId) throws SQLException {
		PreparedStatement ps = con.prepareStatement("select*from student where sId=?");
		ps.setInt(1, sId);
		ResultSet rs = ps.executeQuery();
		Student st = new Student();
		rs.next();
		st.setsId(rs.getInt(1));
		st.setsName(rs.getString(2));
		st.setsFather(rs.getString(3));
		st.setSmob(rs.getInt(4));
		st.setsDep(rs.getString(5));
		return st;
	}

	@Override
	public int deletStudent(int sId) {
		int i = 0;
		try {
			PreparedStatement ps = con.prepareStatement("delete from student where sId =?");
			ps.setInt(1, sId);
			i = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}

	@Override
	public int creatStudent(Student st) {
		int i = 0;
		try {
			PreparedStatement ps = con
					.prepareStatement("insert into student(sid,sName,sFather,sMono,sDep)value(?,?,?,?,?)");
			ps.setInt(1, st.getsId());
			ps.setString(2, st.getsName());
			ps.setString(3, st.getsFather());
			ps.setInt(4, st.getSmob());
			ps.setString(5, st.getsDep());
			i = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}

	@Override
	public int updateStudent(Student st) {
		int i = 0;
		try {
			PreparedStatement ps = con
					.prepareStatement("update student set sName = ?, sFather = ?, sMono = ?,  sDep = ? where sId = ?");
			ps.setString(1, st.getsName());
			ps.setString(2, st.getsFather()); // yaha par dublicate vale kyu aa rahi he 
			ps.setInt(3, st.getSmob());
			ps.setString(4, st.getsDep());
			ps.setInt(5, st.getsId());

			 i = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}

	@Override
	public Student readStudentById_Name_Mob(int sId, String sName, int mob) {
		Student stu = new Student();

		try {
			PreparedStatement ps = con.prepareStatement("selet*from student where sId =? and sName=? and sMono = ? ");
			ps.setInt(1, sId);
			ps.setString(2, sName);
			ps.setInt(3, mob);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				// Student stu = new Student ();
				stu.setsId(rs.getInt(1));
				stu.setsName(rs.getString(2));
				stu.setsFather(rs.getString(3));
				stu.setSmob(rs.getInt(4));
				stu.setsDep(rs.getString(5));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return stu;
	}

}

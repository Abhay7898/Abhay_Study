package db_Connection_For_Student;

import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Student_InterFace_Implimention implements StudentInterFace{
	Connection con =(Connection) Db_Connection_Student.getConnetion();//usne ye () me coonection kyu le liya
	@Override
	public List<Student> readAllStudent() throws SQLException {
		PreparedStatement ps=con.prepareStatement("select* from student");
		return null;
	}

	@Override
	public Student readStudentById(int sId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deletStudent(int sId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int creatStudent(Student st) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateStudent(Student st) {
		// TODO Auto-generated method stub
		return 0;
	}

}

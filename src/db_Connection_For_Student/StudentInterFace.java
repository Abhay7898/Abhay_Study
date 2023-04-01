package db_Connection_For_Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentInterFace {
	public List<Student> readAllStudent()throws SQLException;
	
	public Student readStudentById(int sId) throws SQLException;
	
	public int  deletStudent(int sId);
	
	public int creatStudent(Student st);
	
	public int  updateStudent(Student st);
}

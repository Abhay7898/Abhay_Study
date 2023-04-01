package student_DB_Connection;

import java.sql.SQLException;
import java.util.List;

public interface StudentInterFace {
	
	public List <Student> readAllStudent()throws SQLException;
	
	public Student readByStudentId(int id)throws SQLException;
	
	public int  createStudent(Student stu );
	
	public boolean updateStudsent(Student Stu);
	
	public boolean deleteStudent(int id);
	
	public boolean deleteStudentByIdAndName(int sId , String sName);

}

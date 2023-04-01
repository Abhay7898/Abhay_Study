package student_Connetion_From_DB;

import java.sql.SQLException;
import java.util.List;

public interface StudentInterFace {
	public List<Student> readAllStudent() throws SQLException;
	
	public Student resdStudentById(int id) throws SQLException;
	
	public boolean deleteStudent( int sId);
	
	public boolean updateStudent(Student st);
	
	public int  CreateStudent (Student st);
	
	public boolean deleteStudentByIdAndName(int id ,String name);
	
	public Student readStudentByIdAndNameAndMob(int id, String name ,int mob);
	
}

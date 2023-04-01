
package student_DB_Connection;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OpreetionStudent {
	public static void main(String[] args) throws SQLException {
		StudentInterFaceImptation sfi = new StudentInterFaceImptation();

		/*
		 * List<Student> student = s.readAllStudent();
		 * 
		 * for (Student s1 : student) { System.out.println(s1); }
		 */

		/*
		 * 
 st2 =s.readByStudentId(1); st2.toString();
		 */

		Student s = new Student();
		s.setsId(8);
		s.setsName("palu");
		s.setsFather("Kalu");
		s.setsMono(900900);
		s.setsDep("IT");

		int i = sfi.createStudent(s);
		if (i == 0) {
			System.out.println("Data Not insert");
		} else {
			System.out.println("Data Inserted");
		}
	}
}

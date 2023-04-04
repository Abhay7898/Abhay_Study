package student_Connetion_From_DB;

import java.sql.SQLException;

import java.util.List;

public class StudentOpretion {
	public static void main(String[] args) throws SQLException {
		StudentIntFaceImplimentation s= new StudentIntFaceImplimentation();
	//	readByIdAndNameAndMob();
		//System.out.println(st);
		// List<Student> student = s.readAllStudent();
		// for (Student s1 : student) {
		// s1.toString();
		// }
		/*
		 * Student stu=s.resdStudentById(2); 
		 * stu.toString();
		 */
		/*Student st = new Student();
		st.setSid(9);
		st.setsName("Abhay Kumar");
		st.setsFather("Sanjay Kumar");
		st.setsMono(6484643);
		st.setsDep("MCA");
		int stu =s.CreateStudent(st);
		if(stu ==0) {
			System.out.println("Data not Inserted");
		}
		else {
			System.out.println("Data Inserted");
		}*/
		
		Student st = new Student();
	    st.setSid(10);
		st.setsName("Abhay");
		st.setsFather("Sanjay ");
		st.setsMono(789884592);
		st.setsDep("MCA");
		boolean bu =s.updateStudent(st);
		if (bu) {
			System.out.println("Data not update");
		}
		else {
			System.out.println("Data update");
		}
		
		/*boolean  delete = s.deleteStudent(6);
		if (delete) {
			System.out.println("Record Delete ");
		}
		else {
			System.out.println("Record Not Delete");
		}*/
		
		
		
		 /*boolean de=s.deleteStudentByIdAndName(1, "Abhay"
		 		+ "");
		if (de) {
			System.out.println("Record Delete");
		}else {
			System.out.println("Record Not Delete");
		}
	//	Student stu = s.readStudentByIdAndNameAndMob(2, "Abhay", 789884592);
		//stu.toString();*/
		
		
	}

	private static void readByIdAndNameAndMob() {
		StudentIntFaceImplimentation s = new StudentIntFaceImplimentation();
		Student st = s.readStudentByIdAndNameAndMob(1, "Abhay", 789884592);
		st.toString();
	}
}

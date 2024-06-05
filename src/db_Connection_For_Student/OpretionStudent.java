package db_Connection_For_Student;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

public class OpretionStudent {
	public static void main(String[] args)throws SQLException {	
		//readAllStudent();
		//readStudentByID();
		//deletStudentbyId();
		//creatStudent();
		//updateStudent();
	
	}

	private static void updateStudent() {
		Student_InterFace_Implimention st = new Student_InterFace_Implimention();
		Student stu = new Student();
		stu.setsId(7);
		stu.setsName("Abhay");
		stu.setsFather("Sanjay");
		stu.setSmob(789884592);
		stu.setsDep("MCA");
		int value =st.updateStudent(stu);
		if(value>0) {
			System.out.println("Data Update");
		}else {
			System.out.println("Data not Update");
		}
	}

	private static void creatStudent() {
		Student_InterFace_Implimention st = new Student_InterFace_Implimention();
		Student stu = new Student();
		stu.setsId(1);
		stu.setsName("Abhay Kumar");
		stu.setsFather("Sanjay Kumar");
		stu.setSmob(961781570);
		stu.setsDep("MCA");
		int value=st.creatStudent(stu);
		if (value >0) {
			System.out.println("Data Inserted");
		}else {
			System.out.println("'Data Not Inserted");
		}
	}

	private static void deletStudentbyId() {
		Student_InterFace_Implimention im = new Student_InterFace_Implimention();
		int r=im.deletStudent(1);
		if(r>0) {
			System.out.println("Data Delete");
		}
		else {
			System.out.println("Data not Delete");
		}
	}

	private static void readStudentByID() throws SQLException {
		Student_InterFace_Implimention im1 = new Student_InterFace_Implimention();
		Student st =im1.readStudentById(5);
		//System.out.println(st);
		st.toString();
	}

	private static void readAllStudent() throws SQLException {
		Student_InterFace_Implimention im = new Student_InterFace_Implimention();
		List <Student> student =im.readAllStudent();
		for(Student st : student) {
			System.out.println(st);
		}
		
	}
}

package compratorInterface;

import java.util.ArrayList;
import java.util.Collections;

public class StudentCompratorTest {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));
		al.add(new Student(107, "Balu", 19));

//		Collections.sort(al, new AgeComprator());
		
//		Collections.sort(al, new NameComprator());
		
//		Collections.sort(al, (o1,o2) -> o1.getName().compareTo(o2.getName()));
		
		Collections.sort(al, (o1,o2)-> Integer.valueOf(o1.getAge()).compareTo(o2.getAge()));

		System.out.println(al);
	}
}

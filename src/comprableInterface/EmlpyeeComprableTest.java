package comprableInterface;

import java.util.ArrayList;
import java.util.Collections;

public class EmlpyeeComprableTest {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "Vijay", 23));
		al.add(new Employee(106, "Ajay", 27));
		al.add(new Employee(105, "Jai", 21));
		
		Collections.sort(al);
		
		System.out.println(al);
		
	}

}

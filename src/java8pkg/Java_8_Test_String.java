package java8pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java_8_Test_String {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("Ram");
		list.add("Abhay");
		list.add("Kalu");
		list.add("Raju");

		/*
		 * for (String i : list) { if (i.startsWith("R")) { System.out.println(i); } }
		 */

	//	list = list.stream().filter(s -> s.startsWith("K")).collect(Collectors.toList());
		
		list = list.stream().map(e -> "Mr.".concat(e)).toList();
		System.out.println(list);

	}

}

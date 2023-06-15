package java_1_8_13_June_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaExpreation_Fillter {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 6, 45, 3, 5, 3, 5));
		//////////////////////////////////////
		List<Integer> lis2 = new ArrayList<>();
		for (int i : list) {
			if (i % 2 == 0) {
				lis2.add(i);
			}
		}
		list.clear();
		list.addAll(lis2);
//		System.out.println(list);
		/////////////////////////////////////

		list = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		list = list.stream().filter(i -> i % 2 != 0).toList();
//		System.out.println(list);
		/////////////////////////////////////////

		List<Integer> li = new ArrayList<>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 9, 8, 9, 10, 23, 34, 15, 6, 45, 3, 5, 3, 5));

		li = li.stream().filter(i -> i % 2 != 0 && i > 5).toList();
		 System.out.println(li);
		 
		 li.forEach(s -> {
			 System.out.print(s + " ");
		 });

		li.stream().filter(i -> {
			if (i % 2 != 0 && i > 6) {
				return true; // mayur bhai
			}
			return false;
		}).toList();

		///////////////////////////////////////////////////////////

		List<String> liString = new ArrayList<>(Arrays.asList("Hello", "Abashay", "Nandini", "Sneha", "Abhaisk"));

		long l = liString.stream().filter(s -> s.startsWith("U")).count();

//		System.out.println(l);

	}

}

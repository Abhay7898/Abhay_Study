package java8pkg;

import java.util.ArrayList;
import java.util.List;

public class Java_8_Test_Intger {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);

		
		/*
		 * for (Integer i : list) { System.out.println(i * 2); }
		 */	 
		
		
		

		//list = list.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
		
		list = list.stream().map(s -> s + 1).toList();
		
		System.out.println(list);

	}

}

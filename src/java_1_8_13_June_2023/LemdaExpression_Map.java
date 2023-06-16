package java_1_8_13_June_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LemdaExpression_Map {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 9, 8, 9, 10, 23, 34, 15, 6, 45, 3, 5, 3, 5));

		for (int i = 0; i < li.size(); i++) {

			int n = li.get(i);

//			li.set(i, n + 1);
		}

//		System.out.println(li);
		//////////////////////////////////////////////
		
		li = li.stream().map(s -> s * 2).toList();
//		System.out.println(li);
		
		//////////////////////////////////////
		
		List<String> liString = new ArrayList<>(Arrays.asList("Hello", "Abashay", "Nandini", "Sneha", "Abhaisk"));

		
	    liString = liString.stream().map(s -> "Mr.".concat(s)).toList();
		
		//liString = liString.stream().map(s -> s.toLowerCase()).toList();
		
		System.out.println(liString);
		
	}

}
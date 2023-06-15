package java_1_8_13_June_2023;

import java.util.List;
import java.util.Optional;

public class OptinalClassTest {

	public static void main(String[] args) {

		String[] str = new String[10];
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		
		if (checkNull.isPresent()) { // check for value is present or not
			String lowercaseString = str[5].toLowerCase();
			System.out.print(lowercaseString);
		} else
			System.out.println("string value is not present");
	}


	
	
	private static void abc(List<Integer> list) {
		
		System.out.println(list.size());
		Optional value = Optional.of(list);	
		
	}
}

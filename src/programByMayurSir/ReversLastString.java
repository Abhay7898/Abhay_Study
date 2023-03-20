package programByMayurSir;

import java.util.Arrays;

public class ReversLastString {
	public static void main(String[] args) {

		String str = "The Collection in Java is a framework";
		// The Collection in Java is a krowemarf
		String word[] = str.split("\\s");
		/*
		 String st=str.replace(" framework"," "+"krowemarf"); System.out.println(str);
		 System.out.println(st); // replace word Using Method
		 */
		
		for (int i = 0; i < word.length; i++) {  //with for loop
			String wordLast = word[i];
			if (wordLast.equals("framework")) {
				word [i]= "krowemarf";
			}
		}
		System.out.println(Arrays.toString(word));
		
		
		
		

	}
}

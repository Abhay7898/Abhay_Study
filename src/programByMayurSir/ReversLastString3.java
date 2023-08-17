package programByMayurSir;

import java.util.Arrays;

public class ReversLastString3 {
	public static void main(String[] args) {
		String str = "The Collection in Java is a framework";
		// The Collection in Java is a krowemarf
		String word[]=str.split("\\s");
		System.out.println(word[0]);
		String lastWord = word[word.length-1];
		
		char ch[] =lastWord.toCharArray();
		 String wordNew = "";

		for (int i = ch.length - 1; i >= 0; i--) {
			wordNew += ch[i];
		}
		word[word.length - 1] = wordNew;
		//System.out.println(str);
		//System.out.println(Arrays.toString(word));

	}

}

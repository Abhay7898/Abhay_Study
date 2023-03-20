package programByMayurSir;

import java.util.Arrays;

public class ReversLastString2 {
	public static void main(String[] args) {
		String str = "The Collection in Java is a framework";
		// The Collection in Java is a krowemarf

		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char charter = ch[i];
			if (charter == 'f') {
				ch[i] = 'k';
				continue;
				 }
				 else if (charter == 'r') {
				 ch[i]='t';
			}
		}
		System.out.println(Arrays.toString(ch));
	}
}

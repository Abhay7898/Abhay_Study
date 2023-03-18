package stringTest;

import java.util.Arrays;

public class ToReplaceChar {
	public static void main(String[] args) {
		
		String s = "Hello World";   // using  for  Lops
		
		char []ch= s.toCharArray();
		
		for (int i= 0;  i<s.length(); i++) {
			char c= ch[i];
			if (c == 'H') {
				ch [i] = 'y';
			}
		}
		System.out.println(Arrays.toString(ch));      // ye Array kya he 
	
	
	String st = "Abhay Garhwal";
	String sta2=st.replace("y", "b");  // using Method 
	System.out.println(sta2);   
	
	System.out.println(sta2.toLowerCase());
	System.out.println(sta2.toUpperCase());
	}
}


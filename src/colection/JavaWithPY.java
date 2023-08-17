package colection;

import java.util.ArrayList;

public class JavaWithPY {
	public static void main(String[] args) {
		
	
    ArrayList <String> list =  new ArrayList<>();
	String str = "The Collection in Java is a framework c provides an architecture to store and manipulate the group of objects.";
	String word [] = str.split("\\s");
	for (int i=0; i <word.length;i++) {
		if (word.equals("Java")) {
			word = null;
		}
	}	
	System.out.println(str);		
	}

}

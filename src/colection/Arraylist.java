package colection;
import java.util.ArrayList;
public class Arraylist {
	public static void main(String[] args) {
		
		ArrayList <String> list =  new ArrayList<>();
		String str = "The Collection in Java is a framework c provides an architecture to store and manipulate the group of objects.";
		// String list store ***
		// Java replace " poaton"
		// remove that word
		// the <--> position <-->.objects
		// size of list***
		// string print without ,
		String word [] = str.split("\\s");
		for (int i =0; i<word.length ;i++) {
			list.add(word[i]);
		}
		System.out.println(list);
		System.out.println(list.size());
	}
}

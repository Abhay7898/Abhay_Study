package stringTest;

public class SimpalTest_String {
	public static void main(String[] args) {
		String s = new String("Abhay Garhwal student MCA");

		// char ch [] = st.toCharArray();
		// System.out.println(ch.toString()); // ye hash code kyu de raha he

		String s1 = "Garhwal";
		String s2 = "MCA";
		System.out.println(s.charAt(0));

		System.out.println(s.compareTo(s2)); // ye Index kyu de rahi he true /false kyu nhi

		System.out.println(s.indexOf("MCA")); // ye 22 kyu de raha he //puchna 1.endwith() 2. equals() 3.
		/*
		 * for(int i =0;i<word.length;i++) 
		 * { String wordLast = word[i]; if (wordLast ==
		 * "framework") { wordLast = "framework"; } } System.out.println();
		 */

	}

}

package stringTest;

public class Torevers {
	public static void main(String[] args) {
		int j=6;
		String st = "I Am Abhay Garhwal Student Of Ips Accedmey ";
		String word[] =st.split("\\s");
		for(int i = 0;i<word.length;i++) {
			if(i==j) {
				String newWord = word[i];
				char ch[] =newWord.toCharArray();
				for(int a=ch.length-10;a>=0;a--) {
				
				}
			}
		}
	}

}

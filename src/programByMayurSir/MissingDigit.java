package programByMayurSir;

public class MissingDigit {
	public static void main(String[] args) {

		int[] n = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		int missingWord = n[0];
		for (int i = 0; i < n.length; i++) {
			if (missingWord != n[i]) {
				System.out.println(missingWord);
					break;
			}
			missingWord++;
		}
		
	}
}

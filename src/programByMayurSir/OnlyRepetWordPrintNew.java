package programByMayurSir;

public class OnlyRepetWordPrintNew {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 2, 3, 4, 3, 6, 5, 4, 6, 4, 8, 8, 5, 6, 3, 2 };
		for(int i=0;i<a.length;i++) {
			int word=a[i];
			for(int j=i+1;j<a.length;j++) {
				int nextWord=a[j];
				if(word==nextWord) {
					System.out.print(nextWord);
				}
			}
		}
	}

}

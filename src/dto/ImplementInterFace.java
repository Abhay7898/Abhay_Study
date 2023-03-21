package dto;

public class ImplementInterFace implements Methods {

	@Override
	public void printInt(int a) {
		System.out.println(a);

	}

	@Override
	public void printchar(char a) {
		System.out.println(a);

	}

	@Override
	public void printfloat(float a) {
		System.out.println(a);

	}

	@Override
	public void printString(String a) {
		System.out.println(a);

	}

	@Override
	public void printStringToarray(String a) {
		String word[] = a.split("\\s");
		for(int i=0;i<word.length;i++) {
			System.out.print(word[i]);
		}
		
	}

	
}
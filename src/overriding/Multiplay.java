package overriding;

public class Multiplay extends Divide {
	public void add() {
		System.out.println("Mayur Multiplay");
	}

	public void add(int a) {
		System.out.println(a);
	}

	public void add(int a, int b) {
		System.out.println(a * b);
	}

}

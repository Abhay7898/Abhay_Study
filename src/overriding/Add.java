package overriding;

public class Add {
	public void add() {
		System.out.println("Abhay Add");
	}

	public void add(int a) {
		System.out.println(a);
	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}

}

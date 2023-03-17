package overriding;

public class Sub extends Multiplay{
	public void add() {
		System.out.println("Nandini Sub");
	}

	public void add(int a) {
		System.out.println(a);
	}

	public void add(int a, int b) {
		System.out.println(a - b);
	}

}

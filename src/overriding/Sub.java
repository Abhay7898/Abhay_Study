package overriding;

public class Sub extends Multiplay{
	public void addd() {
		System.out.println("Nandini Sub");
	}

	public void add(int a) {
		System.out.println(a+"Sub");
	}

	public void add  (int a, int b) {
		System.out.println(a - b);
	}

}

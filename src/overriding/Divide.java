package overriding;

public class Divide extends Add {
	public void add() {
		System.out.println("Abhishek Divide");
	}

	public void add(int a) {
		System.out.println(a+"Divide");
	}

	public void add(int a, int b) {
		System.out.println(a / b);
	}

}

package java_1_8_13_June_2023;

public interface Default {
	
	
//	public void astarctMethod();
	
	default void defaultMethod() {
		System.out.println("Default");
		privateMethod();

	}

	default void defaultMethod(int i) {
		System.out.println("Default i");
	}

	static void staticMethod() {
		System.out.println("static ");

	}

	static public void staticMethod_1(int i) {
		System.out.println("static i");
	}
	
	private void privateMethod() {
		System.out.println("Hello");
	}
	private void privateMethod_1(int i) {
		System.out.println("Hello");
	}

}

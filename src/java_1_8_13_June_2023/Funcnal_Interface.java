package java_1_8_13_June_2023;

@FunctionalInterface
public interface Funcnal_Interface {

//	void add();
	int add(int a, int b);

	//	void add1();
	default void deafultMsthod() {

	}

	default void deafultMsthod_1() {

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

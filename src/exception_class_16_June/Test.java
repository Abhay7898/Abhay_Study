package exception_class_16_June;

public class Test {

	public static void main(String[] args) {

		Test h = new Test();

		System.out.println(h.get());

	}

	int get() {
		try {
			return 0;
		} catch (Exception e) {
			return 1;
		} finally {
			return 3;
		}
	}

}

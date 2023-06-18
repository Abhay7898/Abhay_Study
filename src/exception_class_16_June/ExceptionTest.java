package exception_class_16_June;

public class ExceptionTest {

	public static void main(String[] args) {

		try {
			hello();

		} catch (CustomException e) {
			
			e.printStackTrace();
			//e.getCause();
			System.out.println(e.getMessage());
		}
		
	}

	public static void hello() {
		try {
			int a = 10 / 0;

		} catch (ArithmeticException e) {
			throw new CustomException(e);
		}
	}

}

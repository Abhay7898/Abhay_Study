package exception_class_16_June;

public class CustomException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	
	
	public CustomException(Exception e) {
		System.out.println("Hi");
	}
	
	/*
	 * @Override public String getMessage() { 
	 * // TODO Auto-generated method stub
	 * return "Nandini"; 
	 * }
	 */
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
}

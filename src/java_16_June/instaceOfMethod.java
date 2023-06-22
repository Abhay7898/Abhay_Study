package java_16_June;

public class instaceOfMethod {

	public static void main(String[] args) throws ClassNotFoundException {

		Class myClass = Class.forName("java.lang.Object");


		Class c = Class.forName("java.lang.Integer");

		System.out.println("Is c compatible: " + myClass.isInstance(c));
		
		
		
		
	}
}

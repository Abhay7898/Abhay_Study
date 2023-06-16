package java_1_8_13_June_2023;

public class TestDefault implements Default,Default_2{

	public static void main(String[] args) {

		TestDefault t = new TestDefault();
		t.defaultMethod(1);
		

	}

	@Override
	public void defaultMethod() {
		// TODO Auto-generated method stub
//		Default.super.defaultMethod();
	}

	

	

	

	

}

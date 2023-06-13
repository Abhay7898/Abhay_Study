package java_1_8_13_June_2023;

public class TestFuncnalMethod {

//	@Override
//	public void add(int i, int j) {
//		System.out.println(i + j);
//	}


	public static void main(String[] args) {
//		Funcnal_Interface s = new TestFuncnalMethod();
		
		Funcnal_Interface s = (a , b) -> {
//			if(a > 0 && b > 0) {
				return a * b;
//			}
//			return 0;
		};
		
		System.out.println(s.add(4,5));
	}

	/*
	 * @Override public void add() { // TODO Auto-generated method stub
	 * 
	 * }
	 */

}

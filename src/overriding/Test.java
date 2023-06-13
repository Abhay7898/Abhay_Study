package overriding;

public class Test extends Sub {

	public static void main(String[] args) {
		
		Test t = new Test();
		t.add(2, 4);
		Add t1 = new Sub();
		t1.add(3, 4);	
	}

}

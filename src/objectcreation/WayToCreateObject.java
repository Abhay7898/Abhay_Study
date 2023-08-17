package objectcreation;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;

public class WayToCreateObject {
	
	public static final void show() {
		System.out.println();
	}

	public static void main(String[] args) throws Exception {

		WayToCreateObject t = new WayToCreateObject();

		WayToCreateObject t1 = (WayToCreateObject) t.clone();

		WayToCreateObject t3 = (WayToCreateObject) Class.forName("Test").newInstance();

		Constructor t4 = WayToCreateObject.class.getConstructor();
		WayToCreateObject obj2 = (WayToCreateObject) t4.newInstance();

		
		FileInputStream file = new FileInputStream("");
		ObjectInputStream is = new ObjectInputStream(file);

		// Deserialize object
		WayToCreateObject t5 = (WayToCreateObject) is.readObject();
		
		t.show();
	}
	
	
	

}

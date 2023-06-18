package cloningTest;

public class ObjectCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		EmployeeSallow e = new EmployeeSallow();
		e.setI(1);
		e.setName("Abay");

		
		// Sallow Cloning
		EmployeeSallow e1 = (EmployeeSallow) e.clone();
//		System.out.println(e1.getI());
//		System.out.println(e1.getName());

		
		EmployeeDeep ed = new EmployeeDeep();
		ed.setI(1);
		ed.setName("Abay");

		
		// Deep Cloning
		EmployeeDeep ed1 = ed.clone();

		System.out.println(ed1.getI());
		System.out.println(ed1.getName());

	}

}

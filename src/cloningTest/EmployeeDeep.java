package cloningTest;

public class EmployeeDeep implements Cloneable {
	
	private int i;

	private String name;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	protected EmployeeDeep clone() throws CloneNotSupportedException {
		// Deep Cloning
		EmployeeDeep e = new EmployeeDeep();
		e.setI(getI());
		e.setName(getName());	
		return e;
		
	}

}

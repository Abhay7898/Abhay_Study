package cloningTest;

public class EmployeeSallow implements Cloneable {
	
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
	protected Object clone() throws CloneNotSupportedException {
		// Sallow cloning
		return super.clone();
	}

}

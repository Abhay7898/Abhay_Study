package encapsulation;

public class Student {
	private int id;
	private String name;
	private String fName;
	private String dep;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}
	@Override
	public String toString() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(fName);
		System.out.println(dep);
		return null;
	}

}

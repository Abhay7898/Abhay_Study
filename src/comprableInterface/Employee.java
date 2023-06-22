package comprableInterface;

public class Employee implements Comparable<Employee> {
	int rollno;
	String name;
	int age;

	
	
	public Employee(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*
	 * @Override public int compareTo(Employee o) { return
	 * name.compareTo(o.getName()); }
	 */

	
	@Override
	public int compareTo(Employee o) {
		return Integer.valueOf(age).compareTo(o.getAge());
	}

	
	@Override
	public String toString() {
		return "Employee [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}

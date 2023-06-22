package SerilizableInterface;

import java.io.Serializable;

public class Department implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	 int rollno;
	 transient String name;
	int age;
	double salary;

	
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
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

package db_Connection_For_Student;

import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 123;
	private int sId;
	private String sName;
	private String sFather;
	private int smob;
	private String sDep;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsFather() {
		return sFather;
	}
	public void setsFather(String sFather) {
		this.sFather = sFather;
	}
	public int getSmob() {
		return smob;
	}
	public void setSmob(int smob) {
		this.smob = smob;
	}
	public String getsDep() {
		return sDep;
	}
	public void setsDep(String sDep) {
		this.sDep = sDep;
	}
	@Override
	public String toString() {
		System.out.print(sId+" ");
		System.out.print(sName +" ");
		System.out.print(sFather+" ");
		System.out.print(smob+" ");
		System.out.print(sDep+" ");
		return null;
	}
}

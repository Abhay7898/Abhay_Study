package student_DB_Connection;

public class Student {
	// sid,sName,sFather,sMono,sDep

	private int sId;
	private String sName;
	private String sFather;
	private int sMono;
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
	
	
	public int getsMono() {
		return sMono;
	}
	public void setsMono(int sMono) {
		this.sMono = sMono;
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
		System.out.println(sName+" ");
		System.out.println(sFather+" ");
		System.out.println(sMono+" ");
		System.out.println(sDep+" ");
		return null;
				}
}

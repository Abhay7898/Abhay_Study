package student_Connetion_From_DB;

public class Student {
	private int sid;
	private String sName;
	private String sFather;
	private int sMono;
	private String sDep;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
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
	System.out.print(sid+" ");
	System.out.print(sName+" ");
	System.out.print(sFather+" ");
	System.out.print(sMono+" ");
	System.out.print(sDep+" ");
	System.out.println();
	return null;
		
	}

}

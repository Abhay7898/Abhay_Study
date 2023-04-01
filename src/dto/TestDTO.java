package dto;

public class TestDTO extends ImplementInterFace{
	public static void main(String[] args) {
		String abhay="Abhay garhwal";

		Model m = new Model();
		m.setSid(01);
		m.setCh('A');
		m.setF(10.10f);
		m.setName("Abhay");
		String []j = new String[10];
		j[0] = abhay;
		m.setName1(j);
	
		
		 ImplementInterFace i = new ImplementInterFace();
		 
		 
		
	}

}

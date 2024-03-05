package spring_Project_Some_Method;

public class Encryption {
	public static String getPassword(String password) {

		char ch[] = password.toCharArray();

		String str = "";
		for(char c : ch) {
			str += "*123" + c + "321*";
		}
		return str;
	}

	public static void main(String[] args) {
		String a = "Abhay@";
		String eycPassword = Encryption.getPassword(a);
		
		String s = eycPassword.replace("*123", "").replace("321*", "");
		
		System.out.println(eycPassword);
		System.out.println(s);
	}
}

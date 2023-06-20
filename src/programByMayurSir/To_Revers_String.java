package programByMayurSir;

public class To_Revers_String {

	public static void main(String[] args) {
		String str="I Am Abhay";
		char ch[]=str.toCharArray();
		str="";
		for(int i=ch.length-1;i>=0;i--) {
			str=str.concat(str.valueOf(ch[i]));
		}
		System.out.println(str);
	}
}

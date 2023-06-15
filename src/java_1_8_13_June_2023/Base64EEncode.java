package java_1_8_13_June_2023;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64EEncode {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String base64encodedString = Base64.getEncoder().encodeToString("Mayur".getBytes("utf-8"));
		
		
		
		System.out.println(base64encodedString);
		String s = base64encodedString + "ETYRU";
		System.out.println(s);
		
		String s1 = s.substring(0,8);
		
		System.out.println(s1);
		;

		// Decode
		byte[] base64decodedBytes = Base64.getDecoder().decode(s1);

		System.out.println(new String(base64decodedBytes, "utf-8"));

	}

}

package programByMayurSir;

import java.util.Arrays;

public class Remove_Vowel_From_String {
	public static void main(String[] args) {
		String s = "It uses those low order bytes of the result that can fit into the size of the type allowed by the operation";
		char ch[] = s.toCharArray();
		for (int i = 0; i <ch.length; i++) {
          if(ch[i]=='a') {
        	  ch[i]=' ';
        	  continue;
          }
          if(ch[i]=='e') {
        	  ch[i]=' ';
        	  continue;
          }
          if(ch[i]=='i') {
        	  ch[i]=' ';
        	  continue;
          }
          if(ch[i]=='o') {
        	  ch[i]=' ';
        	  continue;
          }
          if(ch[i]=='u') {
        	  ch[i]=' ';
        	  continue;
          }
		}
		System.out.print(Arrays.toString(ch));
	}

}

package I_O_opretion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

public class Read_data_from_files {
	public static void main(String[] args) throws IOException{
		FileReader fr =null;
		BufferedReader bf = null;
		try {
			fr=new FileReader("D:\\Java Files//Hello.txt");
			bf= new BufferedReader(fr);
			String st =" ";
			while(st!=null) {
				st=bf.readLine();
				System.out.println(st);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			bf.close();
			fr.close();
		}
	}
}

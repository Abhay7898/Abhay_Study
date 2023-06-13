package I_O_opretion;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class WriteData_In_Files {
	public static void main(String[] args)throws IOException {
		FileWriter fw = null;
		BufferedWriter bw= null;
		try {
			fw=new FileWriter("D://Student.txt");
			bw = new BufferedWriter(fw);
			String st ="Abhay";
			String st3 = "'Abhay New ";
			String st1="Abhay Garhwal";
			String st2 ="\n";
			bw.write(st);
			bw.write(st2);
			bw.write(st1);
			bw.write(st3);
			bw.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

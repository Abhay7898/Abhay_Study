package I_O_opretion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import colection.Arraylist;

public class Copy_Data_From_One_Files_And_Write_In_Another_File {
	public static void main(String[] args) throws IOException {
		TocheckWetherTheFileIsEmptyOrNot();
	}

	private static void TocheckWetherTheFileIsEmptyOrNot() throws IOException {
		List<String> as = Copy_Data_From_One_Files_And_Write_In_Another_File.read_Data_From_File();

		if (as != null && as.size() > 0) {
			writeData(as);
			System.out.println("Done");
		} else {
			System.out.println("Data Not Read");
		}
	}

	private static void writeData(List<String> as) throws IOException {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("D://Student.txt");
			bw = new BufferedWriter(fw);
			for (String st : as) {
				if (st != null) {
					bw.write(st);
					bw.write("\n");
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			bw.close();
			fw.close();
		}
	}

	private static ArrayList<String> read_Data_From_File() {
		ArrayList<String> list = new ArrayList<>();
		try {
			FileReader fr = new FileReader("D://Java Files//Hello.txt");
			BufferedReader br = new BufferedReader(fr);
			String st = " ";
			while (st != null) {
				st = br.readLine();
				list.add(st);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
}

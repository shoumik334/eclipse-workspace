package File_handaling;

import java.io.File;
import java.util.Scanner;

	public class File_read {
	public static void main(String [] args) {
		
		File myFile=new File("readFile.txt");
		try {
			Scanner sc=new Scanner(myFile);
			while(sc.hasNextLine()) {
				String Text=sc.nextLine();
				System.out.println(Text);
			}
			sc.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	

}

package File_handaling;

import java.io.FileWriter;

public class Write_File {

	public static void main(String[] args) {
		try {
			FileWriter myFile=new FileWriter("Write.txt");
			
			myFile.write("Hellow,World");
			myFile.close();
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}

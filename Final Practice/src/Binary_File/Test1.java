package Binary_File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		
		try {
			
			FileOutputStream output = new FileOutputStream("jj.dat");
			
			for(int i=0;i<=20;i++) {
				output.write(i);
			}
			output.close();
			
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		//try (FileInputStream input =new FileInputStream("jj.dat"))
		
		try {
			FileInputStream input =new FileInputStream("jj.dat");
			int value;
			while((value=input.read()) != -1) {
				System.out.print(value+" ");
			}
			input.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}

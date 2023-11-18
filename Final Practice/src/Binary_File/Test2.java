package Binary_File;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws IOException {
		try(DataOutputStream output=new DataOutputStream(new FileOutputStream("Test2.dat"))){
			
			output.writeUTF("SHoumik");
			
			output.writeInt(223);
			
			output.writeUTF("Sadaen");
			
			output.writeInt(204);
			
			output.writeUTF("Parves");
			
			output.writeInt(870);
			
			
		}
		
		
		try(DataInputStream input=new DataInputStream(new FileInputStream("Test2.dat"))){
			
//			System.out.println(input.readUTF()+ " "+input.read());
//			System.out.println(input.readUTF()+ " "+input.read());
			while(true) {
			System.out.println(input.readUTF()+ " "+input.readInt());
			}

			//System.out.println(input.readUTF()+ " "+input.read());

			
		}
		
		catch(IOException e) {
			System.out.println("All read Complete");
		}
	}
	
	

}

package BInary;

import java.io.*;

public class IntBinary {

	public static void main(String[] args) throws IOException {
		
		try(DataOutputStream fout = new DataOutputStream(new FileOutputStream("IntData.dat"))){
			
			for(int i=1000;i<=1005;i++) 
				fout.writeInt(i);	
		}
		
		try(DataInputStream fin = new DataInputStream(new FileInputStream("IntData.dat"))){
			
			while(true) 
				System.out.print(fin.readInt()+" ");
			
		}catch(EOFException ex) {
			System.out.println("Reading complete");
		}catch(IOException ex) {
			System.out.println("IO Exception: "+ex);
		}
		
	}
}

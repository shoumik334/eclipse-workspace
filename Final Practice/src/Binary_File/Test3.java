package Binary_File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Test3 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		int arr[]= {34,23,43,23,34,23,23,2,3,23,21};
		
		
		try(ObjectOutputStream output=new ObjectOutputStream(new FileOutputStream("Test3.dat"))){
			
			output.writeObject(arr);
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
	try(ObjectInputStream input=new ObjectInputStream(new FileInputStream("Test3.dat"))){
			
			int newArray[]=(int [])(input.readObject());
			
			for(int i=0;i<newArray.length;i++)
				System.out.print(newArray[i]+" ");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		

	}

}

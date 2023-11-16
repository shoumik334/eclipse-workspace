package Exception_handaling;

import java.util.Scanner;

class InvalidMarksException extends Exception{
	int marks;
	
	InvalidMarksException(int a){
		marks=a;
	}
	
	public String toString() {
		return "InvalidMarksException: "+marks;
	}
}

public class Exp2 {
	static void compute(int marks) throws InvalidMarksException{
		if(marks>100 || marks<0) {
			throw new InvalidMarksException (marks);
		}
		
		else if ( marks< 33 &&  marks>0) {
			System.out.println("Marks: "+marks+" <> Failed");
		}
		else {
		System.out.println("Marks: "+marks+" <> Passed");
		}
	}
	
	public static void main(String [] args) {
		Scanner sc= new Scanner (System.in);
		int marks;
		System.out.print("Enter your marks: " );
		
		marks=sc.nextInt();
		
		try {
			compute(marks);
		}
		catch(InvalidMarksException e) {
			System.out.println("Exception : "+e);
		}
	}

}

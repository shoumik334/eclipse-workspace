package Exception_handaling;

import java.util.Scanner;

class CGPA extends Exception{
	
	double CG;
	
	CGPA(double CG){
		this.CG=CG;
	}
	public String toString() {
		return "CG:"+this.CG+"CGPA_Exception.";
	}
}

public class Cgpa_handaling {
	
	static void calculate(double CG) throws CGPA{
		
		if(CG>3.0 && CG<=4.0) {
			System.out.println("Your Result is Good");
		}
		else if(CG<3.0 && CG>2.5 ){
			System.out.println("Your Result is Average");
		}
		else if(CG<2.5 && CG>2.0 ){
			System.out.println("Your Result is BAD");
		}
		else if(CG<2.0 && CG>1.0) {
			System.out.println("You are in Probation");
		}
		else
		{
			throw new CGPA (CG);
		}
	}
	
	public static void main (String [] args) {
		
		double CG;
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter Your CGPA:");
		CG=sc.nextDouble();
		
		try {
			calculate(CG);
		}
		catch(CGPA e) {
			e.printStackTrace();
		}
		
	}
}

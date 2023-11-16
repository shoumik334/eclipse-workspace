package Exception_handaling;

import java.util.Scanner;

public class Exp1 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a value: ");
		int a=sc.nextInt();
		
		System.out.print("Enter b value: ");
		
		int b=sc.nextInt();
		
		try {
			double result=a/b;
			System.out.println("Result= "+result);
		}
		catch(Exception e) {
			System.out.println("We failed to divide.\nReason:");
			System.out.println(e);
			
		}
	}

}

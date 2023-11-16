package Exception_handaling;

import java.util.Scanner;

class LiftOverWeightException extends Exception{
	double total_weight;
	
	LiftOverWeightException(double total_weight){
		this.total_weight=total_weight;
		}
	public String toString() {
		return "LiftOverWeightException.Weight: "+total_weight+"kg";
	}
}

public class Lift_Exception {
	
	static void Calculate(double total_weight) throws LiftOverWeightException{
		
		if(total_weight>80) {
			throw new LiftOverWeightException(total_weight);
		}
		else
		{
			System.out.println("Safe.Total Weight : "+total_weight+"kg");
		}
		
		
	}

	public static void main(String[] args) {
		
		double total_weight;
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter total weight in lift : ");
		total_weight=sc.nextDouble();
		
		try {
			Calculate(total_weight);
		}
		catch(LiftOverWeightException e) {
			System.out.println("Exception: "+e);
		}

	}

}

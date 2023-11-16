package Exception_handaling;

import java.util.Scanner;

class DisplacementException extends Exception{
	double velocity,time,displacement;
	
	DisplacementException(double velocity,double time,double displacement){
		this.velocity=velocity;
		this.time=time;
		this.displacement=displacement;
	}
	public String toString() {
		return "DisplacementException.Displacement Cannot be negative:" +displacement;
	}
}

public class Displacement_Exception {
	
	static void Calculate(double velocity,double time,double displacement) throws DisplacementException{
		displacement=velocity*time;
		if(displacement<0) {
			throw new DisplacementException(velocity,time,displacement);
		}
		else {
			System.out.println("Displacement is = "+displacement+" m/s");
		}
	}

	public static void main(String[] args) {
		double velocity=0,time = 0,displacement=0;
		
		//displacement=velocity*time;
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter Velocity :");
		
		velocity=sc.nextDouble();
		
		System.out.print("Enter time(in second) :");
		
		time=sc.nextDouble();
		
		//displacement=velocity*time;
		
		try {
			Calculate(velocity,time,displacement);
		}
		catch(DisplacementException e) {
			
			System.out.println("Exception is: "+e);
		}
		

	}

}

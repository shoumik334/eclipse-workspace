package Task2;

public class Traiangle extends Polygon {
	
	double sideA;
	double sideB;
	double sideC;
	
	public Traiangle (double sideA,double sideB,double sideC) {
		
		this.sideA=sideA;
		this.sideB=sideC;
		this.sideC=sideC;
	}
	
	
	
	public double area() {
		 double s = perimeter() / 2;
		return Math.sqrt(s * (s - sideA)*(s - sideB) * (s - sideC));
	}
	
	public double perimeter() {
		return sideA+sideB+sideC;
		
	}

	}


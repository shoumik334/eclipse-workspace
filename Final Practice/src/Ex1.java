import java.util.Scanner;

class cylinder{
	double height,radius;
	
	public cylinder(double height, double radius) {
		super();
		this.height = height;
		this.radius = radius;
	}
	public double getheight() {
		return height;
	}
	public void setheight(double height) {
		this.height=height;
	}
	public double getradius() {
		return radius;
	}
	public void setradius(double radius) {
		this.radius=radius;
	}
	
	public double volume() {
		return 3.1416*radius*radius*height;
	}
	
}
public class Ex1 {

	public static void main(String[] args) {
		cylinder one = new cylinder(1,1);
//		Scanner sc=new Scanner (System.in);
//	    
//		
//		System.out.println("Enter heught :");
//		double height=sc.nextDouble();
//		
//		
//		System.out.println("Enter radius :");
//		double radius=sc.nextDouble();
//		
		
		
//		one.setheight(height);
//		one.setradius(radius);
		
		
		System.out.println("The volume of cylinder is with radius "+one.radius+" and height "+one.height+" is :" +one.volume());

	}

}

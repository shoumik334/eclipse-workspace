package abstract_task;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle(double radius,String color) {
		
		super(color);
		this.radius=radius;
		
		
	}
	
	public double area() {
		return Math.PI*radius*radius;
	}
	
	public String toString() {
		return "Circle color ="+getColor() + " Circle Radius = " +radius;
	}

	
}

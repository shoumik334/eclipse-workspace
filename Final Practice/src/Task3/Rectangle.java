package Task3;

public class Rectangle extends Shape {
		
	private double length;
	private double width;
	
	public Rectangle(String name,double length,double width) {
		super(name);
		this.width=width;
		this.length=length;
	
	}
	@Override
	public double area() {
		return length*width;
	}
	@Override
	public double perimeter() {
		return 2*length*width;
	}

}

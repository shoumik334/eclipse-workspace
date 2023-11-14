package abstract_task;

public class Rectangle extends Shape {
	
	private double length,width;
	
	public Rectangle(double length,double width,String color) {
		super(color);
		this.length=length;
		this.width=width;
		
	
		}
	public double area() {
		return length*width;
		}
	public String toString() {
		return "Length is ="+length +" and  width is = "+width +" and color of rectangle is = "+getColor();
		
	}

}

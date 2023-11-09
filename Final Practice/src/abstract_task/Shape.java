package abstract_task;

public abstract class Shape {
	private String color;
	
	public Shape(String color) {
		this.color=color;
	}
	
	public abstract double area();
	public abstract String toString();
	
	public String getColor() {
		return color;
	}
	

}

class Circle extends Shape{
	private double radius;
	
	public Circle(double radius,String color) {
		super(color);
		this.radius=radius;
	}
    @Override
	public double area() {
		return Math.PI*radius*radius;
	}
	@Override
	public String toString() {
		
		return "Circle: Radius = " + radius + " , Color = "+getColor();
	}



public static void main(String[] args) {
	
	Circle one = new Circle(10,"red");
	 System.out.println(one.toString());
	 System.out.println("Area of the Circle: " + one.area());
	
}
	
}
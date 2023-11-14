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
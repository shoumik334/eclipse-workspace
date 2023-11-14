package Task2;

public abstract class Polygon {
	
	
	private double perimeter;
	public abstract double area();
	
	public void setPerimeter(double perimeter) {
		 this.perimeter=perimeter;
	}
	public double getPerimeter(){
			return perimeter;
	}
}

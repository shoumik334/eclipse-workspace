package abstract_task;


public class Driver {
	
	public static String compare (Shape x,Shape y) {
		double area1= x.area();
		double area2= y.area();
		
		  if (area1 > area2) {
	            return "The area of the "+ x +" shape is larger.";
	        } else if (area1 < area2) {
	            return "The area of the second shape is larger.";
	        } else {
	            return "The areas of both shapes are equal.";
	        }
		
	}

	public static void main(String[] args) {
		Circle one= new Circle(5,"Yellow");
		
		System.out.println(one.toString());
		System.out.println("Area of Cicle is = "+one.area());

		System.out.println();
		
		Rectangle R=new Rectangle(5,5,"Red");
		System.out.println(R.toString());
		System.out.println("Area of Rectangle is = "+R.area());
		
		 String result = compare(one, R);
	        System.out.println(result);
	}

}

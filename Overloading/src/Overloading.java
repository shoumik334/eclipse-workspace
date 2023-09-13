
public class Overloading {
	static void tell() {
		System.out.println("I'm HUngry ");
	}
	static void change(int [] arr) {
		
		arr[2]=12;
	}
	
	static int type(int a ,int b) {
		return a+b;
	}
	static double type(double a,double b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		//tell();
		
		int [] arr1= {1,2,2,3,4,5,6};
		change(arr1);
		System.out.println(arr1[2]);
		
		int a=5;
		int b=6;
		
		int c;
		c=type(a,b);
		System.out.println(c);
		
		double a1=5.4;
		double b1=6.3;
		
		double c1;
		c1=type(a1,b1);
		System.out.println(c1);
		
		
		
}
}

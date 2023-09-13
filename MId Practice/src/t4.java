class Box5{
	double a;
	double b;
	double c;
	Box5(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	void show() {
		System.out.println(a + b + c);
	}
}
public class t4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box5 ob = new Box5(4, 5 , 6);
		ob.show();
		

	}

}

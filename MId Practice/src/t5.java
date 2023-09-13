class Box6{
	double a;
	double b;
	double c;
	
	Box6(double a,double b,double c){
		
		this.a=a;
		this.b=b;
		this.b=b;
		
	}
	Box6(){
		this.a=1;
		this.b=1;
		this.c=1;
	
	}
//	void setDim(double a,double b,double c){
//		this.a=a;
//		this.b=b;
//		this.c=c;
//		
//	}
	void volume() {
		System.out.print("Volume is ");
		System.out.println(a*b*c);
	}
}
public class t5 {

	public static void main(String[] args) {
		
		Box6 mybox1 = new Box6();
		mybox1.a=1;
		mybox1.b=2;
		mybox1.c=3;
		//mybox1.setDim(5, 6, 1);
		
		mybox1.volume();
	}

}

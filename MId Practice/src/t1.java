class Box{
	double width;
	double height;
	double depth;
	
	Box(double a, double b, double c){
		this.width = a;
		this.height = b;
		this.depth = c;
	}
//	Box(){
//		this.width = 0;
//		this.height = 0;
//		this.depth = 0;
//	}
	void volume() {
		System.out.print("Volume is ");
		System.out.println(width*height*depth);
	}
	void show() {
		System.out.println(width + height+ depth);
	}
}
public class t1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		
		mybox1.width=2;
		mybox1.height=3;
		mybox1.depth=4;
		
		mybox2.width=5;
		mybox2.height=3;
		mybox2.depth=4;
		
		mybox1.volume();
		mybox2.volume();
		

	}

}

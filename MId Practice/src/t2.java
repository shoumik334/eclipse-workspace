class Box2{
	double height;
	double width;
	double depth;
	
	double volume() {
		return height*width*depth;
	}
}
public class t2 {

	public static void main(String[] args) {
		
		Box2 mybox1= new Box2();
		
		mybox1.width=1;
		mybox1.depth=2;
		mybox1.height=3;
		
		double vol;
		
		vol= mybox1.volume();
		
		System.out.println("Volume is " + vol);
		
		

	}

}

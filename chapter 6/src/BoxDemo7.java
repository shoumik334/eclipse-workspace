class Box7{
	double width;
	double height;
	double depth;
	
	Box7(double w,double h,double d){
		width=w;
		depth=d;
		height=h;
	}
	
	double volume() {
		return width*height*depth;
	}
}
public class BoxDemo7 {

	public static void main(String[] args) {
		Box7 mybox1=new Box7(10,20,15);
		Box7 mybox2=new Box7(3,6,15);
		
		double vol;
		
		vol=mybox1.volume();
		System.out.println("Vol is "+vol);
		
		vol=mybox2.volume();
		System.out.println("Vol is "+vol);
		
		

	}

}

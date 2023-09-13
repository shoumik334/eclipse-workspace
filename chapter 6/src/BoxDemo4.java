class Boxx{
	double width;
	double height;
	double depth;
	
	double vol() {
		return width*height*depth;
		
	}
	void setDim(double w,double h,double d) {
		width=w;
		height=h;
		depth=d;
	}
}
public class BoxDemo4 {

	public static void main(String[] args) {
		
		Boxx mybox1=new Boxx();
		Boxx mybox2=new Boxx();
		double volume;
		
		mybox1.setDim(10, 20, 30);
		mybox2.setDim(3, 6, 9);
	
		
		volume = mybox1.vol();
		System.out.println("Volume is " + volume);
		
		volume = mybox2.vol();
		System.out.println("Volume is " + volume);
		
		
		
		}

}

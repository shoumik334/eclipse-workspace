class Box7{
	double width;
	double height;
	double depth;
	
	Box7(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
		
	}
	Box7(){
		width=1;
		height=1;
		depth=1;
	}
	
	Box7(double len){
		width=height=depth=len;
	}
	
	double volume() {
		return width*height*depth;
	}
	
}
public class ch7t2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box7 mybox1=new Box7(10,20,30);
		
		Box7 mybox2= new Box7();
		
		Box7 mybox3 = new Box7(2);
		
		double vol;
		
		vol=mybox1.volume();
		System.out.println("Volume is "+vol);
		
		vol=mybox2.volume();
		System.out.println("Volume is "+vol);
		
		vol=mybox3.volume();
		System.out.println("Volume is "+vol);
		
		
		

	}

}

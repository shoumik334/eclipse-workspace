
class Box{
	double height;
	double width;
	double depth;
	
}

public class Demo_class {

	public static void main(String[] args) {
		
		Box mybox =new Box();
		double vol;
		
		mybox.width=20;
		mybox.height=10;
		mybox.depth=15;
		
		vol=mybox.width * mybox.height * mybox.depth;
		
		System.out.println("Volume is " +vol);

	}

}

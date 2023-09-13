class CheckPrivate{
	private int a;
	private int b;
	
	void seta(int x){
		a=x;
		
	}
	
	int geta() {
		
	return a;
	}
	
	
	void setb(int y) {
		b=y;
	}
	int getb() {
		return b;
	}
}
public class ch7t4 {

	public static void main(String[] args) {
		
		CheckPrivate ob=new CheckPrivate();
		
		ob.seta(5);
		
		System.out.println(ob.geta());
		
		ob.setb(8);
		System.out.println(ob.getb());

	}

}

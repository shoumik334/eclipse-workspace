class Overload{
	
	void test() {
		System.out.println("No peramiter");
	}
	
	void test(int a) {
		System.out.println("one intiger");
		
	}
	
	void test(int a,int b) {
		System.out.println("Two integer");
	}
}
public class ch7t1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overload ob = new Overload();
		
		ob.test();
		ob.test(6);
		ob.test(7,8);
	}

}

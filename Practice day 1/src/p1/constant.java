package p1;
interface A{
	void show();
}

interface B extends A {
	void show2();
	 static String getstring () {
		System.out.println("hello"); 
		return "default";
	}
	
}

class C implements B{

	@Override
	public  void show() {
		
	}

	@Override
	public void show2() {
		
	}
	static String getstring() {
		return "kkkk";
	}
	
}

public class constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = C.getstring();
		System.out.println(a);

	}

}

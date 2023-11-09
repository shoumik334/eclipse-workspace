class A{
	int a;
	
	public void meth2() {
		System.out.println("Class A method 2");	}
	
	
}

class B extends A{
	@Override
	public void meth2() {
		System.out.println("Class B method 2");
		}
	public void meth3() {
		System.out.println("Class B method 3");
		}
}
public class This_Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a =new A();
		a.meth2();
		
		B b=new B();
		b.meth2();
		b.meth3();
		
	}

}

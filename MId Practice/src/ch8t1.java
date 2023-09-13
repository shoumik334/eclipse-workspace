class A{
	int x,y;
	void showxy() {
		System.out.println("i and j : " +x +  "  " +y);
		System.out.println();
	}
}

class B extends A{
	int a,b; 
	void showab() {
		System.out.println("a and b:" +a + " "+b);
	}
	
	void sum() {
		System.out.println("i+j+a+b=" +(x+y+a+b));
	}
}
public class ch8t1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob = new A();
		B ob2=new B();
		
		ob.x=5;
		ob.y=6;
		
		ob.showxy();
		
		ob2.a=3;
		ob2.b=5;
		
		ob2.showab();
		
		ob2.x=3;
		ob2.y=9;
		
		ob2.showxy();
		
		ob2.sum();
		
		

	}

}

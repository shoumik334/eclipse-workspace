class test1{
	
	int a,b;
	
	test1(int x,int y){
		a=x;
		b=y;
	}
	boolean equalTO(test1 o) {
		if(o.a==a && o.b==b)
		{ 
			return true;}
		
		else {
			return false;
	}
}
	
}
public class ch7t3 {

	public static void main(String[] args) {
		
		test1 ob1 =new test1(1,2);
		test1 ob2 =new test1(1,2);
		test1 ob3 =new test1(-3,-3);
		
		System.out.println(ob1.equalTO(ob2));
		System.out.println(ob1.equalTO(ob3));
		

	}

}

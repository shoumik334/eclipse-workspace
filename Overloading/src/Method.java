
public class Method {
	
 int type1(int x,int y) {
		int z;
		if(x>y) {
			z=x-y;
			
		}else {
			z=x+y;
		}
		return z;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5;
		int b=2;
		int c;
		Method obj  = new Method();
		
		c=obj.type1(a,b);
		
		System.out.println(c);
	}

}

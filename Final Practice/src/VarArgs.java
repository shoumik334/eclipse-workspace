
public class VarArgs {
	
	static int sum(int x,int...arr) {
		int result = x;
		for(int a:arr) {
			result+=a;
		}
		return result;
	}
	
	public static void main(String[]args) {
		
		System.out.println(x:2,...arr 5,5);
		
	}

}

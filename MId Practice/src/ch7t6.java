class varArgs{
	static void vatest(int...v) {
		System.out.println("Number of args: " +v.length+ " contents : ");
		
		for(int x:v)
			System.out.print(x+ " ");
		
		System.out.println();
	}
	
	
}
public class ch7t6 {

	public static void main(String[] args) {
		
		vatest(10);
		

	}

}

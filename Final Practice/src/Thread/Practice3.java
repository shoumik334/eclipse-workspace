package Thread;

class MyThr extends Thread{
	public MyThr(String name) {
		super(name);
	}
	
	public void run() {
		int i=0;
		while(i<30) {
			System.out.println("Hey It's me");
			i++;
			
		}
	}
}
public class Practice3 {

	public static void main(String[] args) {
		
		MyThr MTR =new MyThr("SHQejdwj");
		
		 MTR.run();
		 
		 System.out.println(MTR.getId());
		 System.out.println(MTR.getName());
		

	}

}

package Thread;

 class MyThreadRunnable1 implements Runnable{

	@Override
	public void run() {
		int i =0;
		while(i<1000)
		{
			System.out.println("Threrad 1 Run Run");
			i++;
		}
		
	}
	 
 }
 class MyThreadRunnable2 implements Runnable{

	@Override
	public void run() {
		int i =0;
		while(i<1000)
		{
			System.out.println("Threrad 2 Run Run");
			System.out.println("Thread 2 walk Walk");
			i++;
		}
		
	}
	 
 }

public class Practice2 {

	public static void main(String[] args) throws Exception {
		
		MyThreadRunnable1 MTR1 = new MyThreadRunnable1();
		
			Thread Run = new Thread(MTR1);
			
	MyThreadRunnable2 MTR2 = new MyThreadRunnable2();
			
		Thread walk = new Thread(MTR2);
		//Thread.sleep(3000);
		
		Run.start();
		walk.start();
			
			 
	}

}

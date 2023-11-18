package Thread;

class MyThread1 extends Thread{
	public void run() {
		
		int i=0;
		while(i<1000) {
			
			System.out.println("Thread 1");
			System.out.println("Thread 1 ONE ONE");
			i++;
		}
	}
	
}
class MyThread2 extends Thread{
	public void run() {
		
		int i=0;
		while(i<1000) {
			
			System.out.println("Thread 2");
			System.out.println("Thread 2 TWO TWO");
			i++;
		}
	}
	
}

public class Practice1 {

	public static void main(String[] args) {
		
		MyThread1 MT1 =new MyThread1();
		MyThread2 MT2 =new MyThread2();
		
		MT1.start();
		MT2.start();
		
		

	}

}

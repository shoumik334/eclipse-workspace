import java.util.Scanner;

public class SWITCH_CASE {

	public static void main(String[] args) {
		System.out.print ("Entern your age:");
		
		int age;
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		switch(age){
			
			case 18:
				System.out.println("New commer");
				break;
				
			case 30:
				System.out.println("Experienced");
				break;
				
			case 60:
				System.out.println("You are going to retired");
				break;
				
			default:
				System.out.println("Enjoy your life");
				
		}

	}

}

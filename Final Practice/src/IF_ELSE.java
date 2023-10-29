import java.util.Scanner;

public class IF_ELSE {
	public static void main(String[] args) {
		System.out.println("Enter age");
		
		int age;
		
		Scanner sc = new Scanner (System.in);
		
		age=sc.nextInt();
		
		
		
		if(age>50) {
			System.out.println("Experience");
			
		}
		else if(age>40) {
			System.out.println("Semi-Experience");
		}
		else if(age>30) {
			System.out.println("Intermidiate");
		}
		else if(age>20) {
			System.out.println("Begginer");
		}
		else {
			System.out.println("Enter age in <20");
		}
	}

}


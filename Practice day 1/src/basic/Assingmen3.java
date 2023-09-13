package basic;
import java.util.Scanner;

public class Assingmen3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int id,price;
		String title,description,category;
		
		System.out.print("Enter your id: ");
		id=input.nextInt();
		System.out.print("Enter title: ");
		title=input.nextLine();
		
		System.out.print("Enter Price: ");
		price=input.nextInt();
		
		System.out.print("Enter description: ");
		description=input.next();
		System.out.print("Enter category: ");
		category=input.next();
		
		
		
		System.out.println("Id = "+id);
		System.out.println("Title = "+title);
		System.out.println("Price = "+price);
		System.out.println("Description = "+description);
		System.out.println("Catefory= "+category);
	}

}

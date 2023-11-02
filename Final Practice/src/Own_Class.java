
class intro{
	int id;
	String name;
	
	public void printdtails(){
		System.out.println("My id is "+id);
		System.out.println("My name is "+name);
		
	}
}


public class Own_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		intro one= new intro();
		intro two= new intro();
		
		one.id=111;
		one.name="Sadaen Parves";
		
		one.printdtails();
		
		two.id=222;
		two.name="Shoumik";
		
		two.printdtails();

	}

}

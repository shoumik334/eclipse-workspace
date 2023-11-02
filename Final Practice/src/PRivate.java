

class profile{
	private int id;
	private String name;
	
	public profile(String myName,int myId){
		id=myId;
		name=myName;
	}
	
	public void setname(String n) {
		name=n;
	}
	public void setid(int i) {
		id=i;
	}
	public int getid() {
		return id;
	}
	public String getName() {
		return name;
	}
}

public class PRivate {
	public static void main(String[] args) {
		
		profile one=new profile("Shoumik",2);
		
//		one.setid(1233);
//		one.setname("Shoumik");
//		
		System.out.println(one.getid());
		System.out.println(one.getName());
		
	}

}

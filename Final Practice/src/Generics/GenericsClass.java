package Generics;

class MyGenerics<T1,T2>{
	int value;
	
	private T1 t1;
	private T2 t2;
	public MyGenerics(int value,T1 t1,T2 t2) {
		this.value=value;
		this.t1=t1;
		this.t2=t2;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue() {
		this.value=value;
	}
	
	public T1 getT1() {
		return t1;
	}
	public void setT1() {
		this.t1=t1;
	}

	public T2 getT2() {
		return t2;
	}

	public void setT2(T2 t2) {
		this.t2 = t2;
	}
	
	
	
}
public class GenericsClass {

	public static void main(String[] args) {
		MyGenerics<String,Integer> g1=new MyGenerics(34,"dff",45);
		
		String str=g1.getT1();
		Integer INT=g1.getT2();
		
		System.out.println(str);
		System.out.println(INT);
	}

}

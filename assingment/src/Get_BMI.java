class Person{
private double weight,height;
Person(){}
Person(double w,double h){
weight = w;
height = h;
}

Person(double val){
weight = height = val;
}
Person(Person obj){
weight = obj.weight;
height = obj.height;
}

public double BMI() {
return weight/(height*height);
}



public double getWeight() {
return weight;
}
public void setWeight(double weight) {
this.weight = weight;
}
public double getHeight() {
return height;
}
public void setHeight(double height) {
this.height = height;
}

}


public class Get_BMI {

	public static void main(String[] args) {
		
		
		
		
		Person person_one= new Person(70,2.05);
		Person person_two = new Person(80,2);
		Person person_three = new Person(120,2.03);
		
		System.out.println("BMI of person 1 is : "+person_one.BMI());
		 
		System.out.println("Person 1 is Underweight");
		
		System.out.println("BMI of person 2 is : "+person_two.BMI());
		System.out.println("Person 2 is Normal Weight");
		
		System.out.println("BMI of person 3 is : "+person_three.BMI());
		System.out.println("Person 3 is Overwight");
		
		
		person_two.setWeight(100);
		person_two.setHeight(1.6);
		
		System.out.println("New weight and height of person 2 is  : "
		+person_two.getWeight()+" "+person_two.getHeight());
		System.out.println("BMI of Person two is: "+person_two.BMI());
		System.out.println("Now Person 2 is Obese");
		}

	}
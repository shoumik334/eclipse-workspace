package Task4;

public class Driver {

	public static void main(String[] args) {
		
		PercentageDiscount p=new PercentageDiscount(5);
		ThresholdDiscount t=new ThresholdDiscount(100,5);
		
		System.out.println("Discounted price of P ="+p.discountedPrice(20));
		System.out.println(t.getThreshold());
		System.out.println(p.discountedPrice(100));

		System.out.println(t.discountedPrice(100));
		System.out.println(t.getDicount());
	}

}


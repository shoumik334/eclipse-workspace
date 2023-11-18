package Task6;

public class BestForCustomer implements Discountable {
	double percentage;
	double threshold;
	double discount;
	@Override
	public double discountedPrice(double price) {
		return price-(price*(percentage/100));
	}
	
	
	
	

}

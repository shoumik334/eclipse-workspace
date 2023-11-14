package Task4;

public class ThresholdDiscount implements Discountable{
	
	private double threshold;
	private double discount;
	
	public ThresholdDiscount(double threshold,double discount) {
		this.discount=discount;
		this.threshold=threshold;
	}
	
	public void setThreshold(double threshold) {
		this.threshold=threshold;
	}
	public double getThreshold() {
		return threshold;
	}
	public void setDiscount(double Discount) {
		this.discount=discount;
	}
	public double getDicount() {
		return discount;
	}
	
	public double discountedPrice(double price) {
		return price-(price*(discount/100));
	}
	
	

}

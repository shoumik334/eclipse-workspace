package Task5;

public abstract class Temperature {
	private int temp;
	
	public Temperature(int temp) {
		this.temp=temp;
	}
	public void setTemp(int temp) {
		this.temp=temp;
	}
	public int getTemp() {
		return temp;
	}
	
	public abstract String toString();
	public abstract boolean belowFreezing();
	public abstract boolean swimmingWeather();
	
	
	

}

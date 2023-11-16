package Task5;

public class Fahrenheit extends Temperature{
	
	  Fahrenheit(int temp){
		super(temp);
		}
	  @Override
	  public String toString() {
			return "Temperaature: "+this.getTemp()+" Fahrenheit";
	  }
	  @Override
	  public boolean belowFreezing() {
		  return 32 < getTemp();
	  }
	  @Override
	  public boolean swimmingWeather() {
		  return getTemp()>=78 && getTemp()<=86;
	  }

}

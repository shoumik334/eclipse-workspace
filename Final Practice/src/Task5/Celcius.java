package Task5;

public class Celcius extends Temperature {
		
	Celcius(int temp){
			super(temp);
			}
		  
		  @Override
		  public String toString() {
				return "Temperaature: "+this.getTemp()+" Celcius";
		  }
		  @Override
		  public boolean belowFreezing() {
			  return 0 > getTemp();
		  }
		  @Override
		  public boolean swimmingWeather() {
			  return getTemp()>=25 && getTemp()<=30;
		  }

	}




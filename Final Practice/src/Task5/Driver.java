package Task5;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Celcius C=new Celcius(25);
		
		Fahrenheit F=new Fahrenheit(45);
		
		
//		System.out.println(C.toString());
//		System.out.println("Below Freezing:"+C.belowFreezing());
//		System.out.println("Swimming Weather:"+C.swimmingWeather());
//		
//		
//		System.out.println();
//		
//		System.out.println(F.toString());
//		System.out.println("Below Freezing:"+F.belowFreezing());
//		System.out.println("Swimming Weather"+F.swimmingWeather());
		
		
//		try {
//			FileWriter file =new FileWriter("Temperature_result.txt");
//			
//			file.write(C.toString()+"\n");
//			file.write("Below Freezing:"+ C.belowFreezing()+"\n");
//			file.write("Swimming Weather:" + C.swimmingWeather()+"\n\n");
//			
//			file.write(F.toString()+"\n");
//			file.write("Below Freezing:"+ F.belowFreezing()+"\n");
//			file.write("Swimming Weather:" + F.swimmingWeather()+"\n");
//			
//			file.close();
//			
//		}
		
		try(FileWriter file =new FileWriter("Temperature_result.txt")) {
			//FileWriter file =new FileWriter("Temperature_result.txt");
			
			file.write(C.toString()+"\n");
			file.write("Below Freezing:"+ C.belowFreezing()+"\n");
			file.write("Swimming Weather:" + C.swimmingWeather()+"\n\n");
			
			file.write(F.toString()+"\n");
			file.write("Below Freezing:"+ F.belowFreezing()+"\n");
			file.write("Swimming Weather:" + F.swimmingWeather()+"\n");
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//For read
		File myFile=new File("Temperature_result.txt");
		try {
			Scanner sc=new Scanner (myFile);
			
			while(sc.hasNextLine()){
				
				String Line=sc.nextLine();
				System.out.println(Line);
				
			}
			sc.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}
	
	

}

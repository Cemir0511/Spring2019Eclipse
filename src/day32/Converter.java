package day32;

public class Converter {

	public static void main(String[] args) {
		
		int meter = meterToCM (15);
		System.out.println(meter);
		
		double inch = feetToInch(10);
		System.out.println(inch);
		
		
		//the method returned double, double cannot be saved in int variable
		//so we can downcast the result to an int :
		
		// new requirement: 
	    /* what if i want to get the result as int 
	     * without changing the method return type to int
	     * but store the generated result as int
	     * */
		int celcius = (int) faToCelcius(81); 
		System.out.println(celcius);
		//int cel = (int) 27.22222222222222 ; 
		
		//or we can use double as well:
		
		
		double celcius1 = faToCelcius(81);
		System.out.println(celcius1);
	}
	
	
	
	public static int meterToCM (int meter) {
		//100 cm = 1m
		return meter*100;
	}

	
	public static double feetToInch (int feet) {
		double inch =  feet * 12;
		return inch;
	}
	
	public static double faToCelcius (double fahr) {
		
		return (fahr-32) * 5/9;
	
		
	}
	
	// create a method called meterToCM
	// it takes one int as parameter and return CM 

	// create a method called FeetToInch
	// it takes one int as parameter and return Inch as double 

	// create a method called FaToCelcius
	// it takes one double as parameter and return celcius as double 

}

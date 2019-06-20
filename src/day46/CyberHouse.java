package day46;

public class CyberHouse {

	int houseNumber ;
	String design;
	
	//static fileds/variable
	//class variable
	//we can change the default value here if needed
	 // just like instance variables 
	
	static String neibourhoodName;  // this is our static variable that is shared in all class

	
	public CyberHouse(int houseNumber, String design) {
		
		this.houseNumber = houseNumber;
		this.design = design;
	}
	
}

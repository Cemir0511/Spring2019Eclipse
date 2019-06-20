package day40;

public class Computer {

	
	//instance variable/fields get default value 
	//if its not specified in template class
	
	
	// default values can be changed in template class by providing value 
	// in template class itself
	// while declaring the field.
	
	
	//changing default value from null to unknown
	
	String type = "unknown";  //instance field ler
	int ram;
	double screenSize;
	String color;
	String OS;
	boolean isPersonal;
	
	//  ** burada direk assign etmiyoruz instance lari, neden cunku 
	///bu template, baska baska modeller yazamk icin, burasi cookie cutter blueprint
	
	
	
	
	
	// it is highly not recommended to have a main method directly
	// inside your template class-->> use different class object to create object
	
	
	//..burdan main methodu yeni class a tasiyoruz 
}
	

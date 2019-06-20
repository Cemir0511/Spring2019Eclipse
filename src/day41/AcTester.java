package day41;

public class AcTester {

	public static void main(String[] args) {
		
		
		AirConditioner ac = new AirConditioner();
		
			
		ac.brand= "Samsung" ; 
        ac.currentTemp=79.7f;
        ac.isOn=true;
        
        ac.displayBrand();;
        ac.displayAllInfo();
        
        ac.turnOff();
        ac.turnOn();
        ac.showCurrentTemp();
        
        ac.increaseTemp(10);
        System.out.println( ac.currentTemp );
        
        ac.decreaseTemp(20);
        ac.showCurrentTemp();
        
        ac.setTemperature(80f);
        ac.showCurrentTemp();
        
        
		
		
	}

}















/*
 * Class : 
	it's a blueprint or template for an object 

 things we can do : 
 	We can use it as a Type 
 	we can create object out of it 
 	or we can create instance of this class 


 	create a reference variable 
 	method paramters 
 	method return type 
 	type for the Collection objects : ArrayList 
 	or can be type of Array 

 	local varible VS instance variable 
 		 local variable is variable inside a method 

 What we can have inside a class 


 	instance variable/field
 		-- to define properties|attribute|state of object
 		How can we access these fields 
 			in same class 
 				any instance method can directly access 
 			outside of class 
 				create an instance/object to access obj.fieldName

 	instance method 
 		-- add behavior of objects 
 		-- to manipulate the attribute| state of obejct 
 		How can we call this method 
 			in same class 
 				any instance method can directly access 
 			outside of class 
 				create an instance/object to access obj.methodName(arguments)

 	static method
 		-- add behavior to the class 
 		How to call static method : 

 		in the same class 
 			any static method can access another static method directly 
 			by calling methodName(arguments);
 			Or Optionally 
 			ClassName.methodName(arguments ) ; 
 		outside the class 
 			ClassName.methodName(arguments ) ; 

 	// what about static and non-static accessing each other ?  stay tuned 

 	----------- things we did not learn yet --------
 	static variable field
 	Constructor ---- a special method being called when 				object is being created 
 	instance initilizer block and static initilizer block 


WARM UP 
	Create a class called AirContitioner 
	Add instance fields 
		brand as String 
		currentTemp as float  
		isOn as boolean  

	Add below behaviors 
		displayTheBrand() ;
			accept no paramter and print out the brand  
		showCurrentTemp
			accept no paramter and
			simply display current temp on console 

		displayAllInfo 
			accept no paramter and display all AC info 

		turnOn 
			accept no parameter 
			and set isOn value to true if it's not already true

		turnOf 
			accept no parameter 
			and set isOn value to false if it's not already true
		
		increaseTemp
			it accepts one parameter int 
			and increase the value by the amount passed

		decreaseTemp
			it accepts one parameter int 
			and increase the value by the amount passed
		
		setTemperature
			it acceps one paramter int 
			and set the value to that paramter passed 









 */
package day41;

public class AirConditioner {
	
	String brand;
	float currentTemp;
	boolean isOn;
	
	
	
	public void displayBrand() {
		System.out.println("The brand is" + brand);
		
	}
	
    public void showCurrentTemp() {
    	System.out.println("Current temperature: " + currentTemp);
    	
    	
    }
    
    public void displayAllInfo() {
    	displayBrand();
		showCurrentTemp();
		
		 System.out.println("Brand is "+brand+" | The current temp is "+currentTemp+" | Is AC on? "+isOn);
    

    }
    
    public void turnOn() {
         if (isOn) {
			
			System.out.println("It is already on!!!");
		}else {
			isOn = true;
    }
    }
    public void turnOff(){
         if (!isOn) {
			
			System.out.println("It is already off!!!");
		}else {
			isOn = false;
		}
 
         
        // if(isOn) {
          //   isOn = false;
            // System.out.println("It has been turned off");
           //}else {
            // System.out.println("IT IS ALREADY OFF!@");
          // }
         
    	
    }
    public void increaseTemp (int increaseBy) {
    	//currentTemp = currentTemp + increaseBy; 
    	currentTemp += increaseBy;
    }
    
    public void decreaseTemp (int decreaseBy) {
    	//currentTemp = currentTemp - decreaseBy; 
    	currentTemp -= decreaseBy;
    	// an instance method can be called inside another instance method directly
    	//just like an instance field can be accessed directly inside any instance method
	}
    
	public void setTemperature (float  targetTemperature) {
		currentTemp = targetTemperature;
	
    	
    }
    
} 
    
    
    
    
    /*
     * WARM UP 
    Create a class called AirContitioner 
    Add instance fields 
        brand as String 
        currentTemp as float  
        isOn as boolean  
        
    Add below behaviors      ///yani instance methods:
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
     * */
    
    
	
	/*
	 * package day41;

public class AirConditioner {

  String brand;
  float currentTemp;
  boolean isOn;
  
  public void displayBrand() {
    System.out.println("the brand is " + brand);
  }
  
  public void showCurrentTemp() {
    System.out.println("currentTemp :  " + currentTemp);
  }
  
  public void displayAllInfo() {
    System.out.println("Brand is "+brand+" | The current temp is "+currentTemp+" | Is AC on? "+isOn);
  }
  
  public void turnOn() {
    
    System.out.println("current AC is " + isOn);
    
    if(isOn == false) {
      isOn = true ; 
    }else {
      System.out.println("It is already on !!!");
    }
    
  }
  
  
  public void turnOff() {
    
    if(isOn) {
      isOn = false;
      System.out.println("It has been turned off");
    }else {
      System.out.println("IT IS ALREADY OFF!@");
    }
    
  }
  
  
  


  
  
  

}
/*
 * WARM UP 
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

    turnOff 
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

  Create a class called ACTester 
    Create 3 object set their field value 
    then call the methods 


 * */
	 
	 
    


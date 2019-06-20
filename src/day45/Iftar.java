package day45;

public class Iftar {

	String food;
	String time;
	String beverage;
	
	// what we can do inside constructor
	// access the fields , set the field value
	// reuse other constructor functionality
	// call methods
	
	public Iftar (String food, String time, String beverage) {
	
	//this.food = food;
	//this.time = time;
	//this.beverage = beverage;
	
		setFood(food);
		setTime(time);
		setBeverage(beverage);
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getBeverage() {
		return beverage;
	}

	public void setBeverage(String beverage) {
		this.beverage = beverage;
	}
	
	
}
/*
 * String food; 
  String time; 
  String beverage; 
  
  // what can we do inside constructor 
  // access the fiels , set the field value 
  // reuse other consructor functionality 
  // call methods 
  
  public Iftar(String food, String time, String beverage) {
  
//    this.food = food;
//    this.time = time;
//    this.beverage = beverage;
    setFood(food);
    setTime(time);
    setBeverage(beverage);
    
  }
  
 * */

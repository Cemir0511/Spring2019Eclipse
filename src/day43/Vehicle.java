package day43;

public class Vehicle {
	
	/*
	 * // 4 access modifier to define access level of fields of methods 
public      --- accessible anywhere
protected   -- stay tuned for later
default(no) -- package private 
private     -- in same class only 

Good Encapsulation practice 
making instance fields private 
and providing public getter/setter for the filed for access and modify 

getter -->> a method for getting the value of your field and the name is specifically recomended in getFieldName() format  and return the value of field

setter -->> a method for setting the value of your field and the name specically sugested to have 
setFieldName(dataType fieldName) and it will set new value for the field and it does not return value 



Create a class called Vehicle 
with few private fields model , make , speed 
create getters and setters for all those private fields 

create methods : 
	increaseSpeed : it accepts one parameter increaseBy as int 
	and increase the speed to new speed. 
	if your current speed is 10 and you pass 5 to this method , outcome should be  ---> 10->11->12->13->14->15->

	decreaseSpeed  : 
	it accepts one parameter decreaseBy as int 
	and decrease the speed to new speed. 
	if your current speed is 10 and you pass 5 to this method , outcome should be  ---> 10->9->8->7->6->5->
	 
	 
	 
	 this keyword:
	 this keyword : 
	is used to address the current object that being worked on 
	we can use it to address the instance field of the class 
		this.fieldName 
	we can also use it to address the instance method of the class 



	 
	 */
	
	
	private String model;
	private String make;
	private int speed;
	
	// how to generate getters and setters? :
	//right click, 
	//select source
	//select generate getters and setters
	//check the checkbox for the filed you want to get/set
	//then click generate
	
	
	
	public void increaseSpeed(int increaseBy) {
		//speed = speed + increaseBy;
		for (int i = 1; i<=increaseBy;  i++) {
			speed++;
			System.out.println(speed + "->");
		}
		System.out.println();

	}

	public void decreaseSpeed (int decreaseBy) {
		for (int i = decreaseBy ; i > 0 ; i--) {
			speed--;
			System.out.println(speed + "->");
	   }
		
		System.out.println();
	}
	
	
	
	public String getModel() {
		return model;
		
	}
	
	//<this> keyword can be used to address 
	//the current object/instance being worked on
	// instance olanlarin hepsiyle kullanilir
	public void setModel(String model) {
		//model = model;
		this.model = model;
		
		
	}
	
	public String getMake() {
		return make ;
	}

	public void setMake(String make) {
		this.make = make;
		
	}
	
	
	public int getSpeed() {  // return this.speed; de diyebilirsin, get de de kullanilanilir yani, optional
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	public void stop() {  // yani speed 0 olur stop da
		                     //setting speed:
		speed = 0;        // 1.direct way  
		this.speed = 0; //2. using this keyword
		setSpeed(0);    //
		this.setSpeed(0);    // bunlardan birini secebilirsin
		
		                          
	}
	
	
	
	
	
	
	
	
	
	
	
}


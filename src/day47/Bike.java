package day47;

public class Bike {

	
	private String brand; 
	  private int gear;
	  private int speed;
	  private int id = 100;
	  
	  private static int countOfBike;
	  
	  private Bike() {
	    //System.out.println("no arg constructor is being called");
	    ++countOfBike ;
	    this.id = countOfBike; 
	  }
	  

	  public Bike(String brand, 
	         int gear, int speed) {
	    this();
	    this.brand = brand;
	    this.gear = gear;
	    this.speed = speed;
//	    ++countOfBike ;
//	    this.id = countOfBike; 
	  }

	  public static void showCurrentCount() {
	    
	    System.out.println("Current Count of Object is "
	        + countOfBike);
	      
	  }
	  public static void reserCount() {
		  countOfBike = 0;
	  }
	  
	  public void speedUp(int increaseBy) {
	    speed=speed+increaseBy;
	  }

	  public void slowdown(int decreaseBy) {
	    speed=speed-decreaseBy;
	  }
	  
	  
	  
	  public String toString() {
	    return "Bike [brand=" + brand + ", gear=" + gear + ", speed=" + speed + ", id=" + id + "]";
	  }


	  public String getBrand() {
	    return brand;
	  }



	  public void setBrand(String brand) {
	    this.brand = brand;
	  }



	  public int getGear() {
	    return gear;
	  }



	  public void setGear(int gear) {
	    this.gear = gear;
	  }



	  public int getSpeed() {
	    return speed;
	  }



	  public void setSpeed(int speed) {
	    this.speed = speed;
	  }



	  public int getId() {
	    return id;
	  }



	
	
	
	
//////////////
	/* Hourma's:
	private String brand;
	private int gear;
	private int speed;
	private String id;
	
	private static int countOfBike;
	
	
	
//	provide getters for all instance fields 
//	privide setters for brand, gear, speed
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getId() {
		return id;
	}
	
//	create 3 args constructors 
//	to set brand, gear, speed
//	and keep the count of objects here	
	public Bike(String brand, int gear, int speed) {
		this.brand = brand;
		this.gear = gear;
		this.speed = speed;
		countOfBike++;
	}

//	set the id value by the count of object to stimulate incremented		
	public void setId(String id) {
		this.id = id + countOfBike;
	}
	
//	call your no arg constructor in here
//	create private no arg constructor  
//	print out no arg is being called	
	private Bike() {
		System.out.println("no arg is being called");
	}

//	create instance methods
//	speedUp : accept one increaseBy as int 
//	return nothing , it will increase current speed by the amount provided
	public void speedUp(int increaseBy) {
		this.speed += increaseBy;
	}
	

//	slowDown : accept one decreaseBy as int 
//	return nothing , it will decrease current speed by the amount provided
	public void slowDown(int decreaseBy) {
		this.speed -= decreaseBy;
	}
	
//	toString method as usual
	public String toString() {
		return "Bike [brand=" + brand + ", gear=" + gear + ", speed=" + speed + ", id=" + id + "]";
	}
	
public static void showCurrentCount() {
	System.out.println(countOfBike);
}
	
	/*  Akbar's:
	private String brand; 
  private int gear;
  private int speed;
  private int id;
  
  private static int countOfBike;
  
  private Bike() {
    System.out.println("no arg constructor is being called");
    ++countOfBike ;
    this.id = countOfBike; 
  }
  

  public Bike(String brand, 
         int gear, int speed) {
    this();
    this.brand = brand;
    this.gear = gear;
    this.speed = speed;
//    ++countOfBike ;
//    this.id = countOfBike; 
  }

  public static void showCurrentCount() {
    
    System.out.println("Current Count of Object is "
        + countOfBike);
      
  }

  public String getBrand() {
    return brand;
  }



  public void setBrand(String brand) {
    this.brand = brand;
  }



  public int getGear() {
    return gear;
  }



  public void setGear(int gear) {
    this.gear = gear;
  }



  public int getSpeed() {
    return speed;
  }



  public void setSpeed(int speed) {
    this.speed = speed;
  }



  public int getId() {
    return id;
  }






  
	 * 
	 */
	
	
	
}

/*WARM UP 
Create a class called Bike 
	private instance fileds : brand, gear, speed , id
	private static field : countOfBike 

	provide getters for all instance fields 
	privide setters for brand, gear, speed

	create 3 args constructors 
		to set brand, gear, speed
		and keep the count of objects here
		set the id value by the count of object to stimulate incremented ID for each objects 
		call your no arg constructor in here

	create private no arg constructor  
		print out no arg is being called 

create instance methods
		speedUp : accept one increaseBy as int 
				return nothing , it will increase current speed by the amount provided

		slowdown : accept one decreaseBy as int 
				return nothing , it will decrease current speed by the amount provided
		toString method as usual 

create static methods showCurrentCount
	accept no arg and just print out static variable count 
*/
package day44;

public class House {



	
	
	
	
	// POJO CLASS
	// PLAIN OLD JAVA OBJECT 

	// boyle class olusturmaya shortcutlarla pjo class deniyor Java provide ediyor yani tum bunlari:
	/*
	 * It has privates fields to represent object's attribute 
	 * it has public getters and setters 
	 * it has constructors to set all the field value 
	 * it has toString method to return String representation of the object 
	 *   in nice format with all fields value 
	 * 
	 * 
	 * */

	//public class House {

	  private String type; 
	  private int bedroom; 
	  private double price;
	  
	  
	  public House() {           // control space ile Constructor otomatik gelir
	    
	  }                          // yada right click
	                             // Source
	                             // Generate Constructor using Fields
	
	  
	  public House(String type, int bedroom, double price) {
	    // super ();  right clikle constructor getirince, super() cikti burda , bunu bilmiyoruz, o yuzden delet ediyoruz
		this.type = type;
	    this.bedroom = bedroom;
	    this.price = price;
	  }


	  public String getType() {
	    return type;
	  }
	//  public void setType(String type) {
//	    this.type = type;
	//  }
	  public int getBedroom() {
	    return bedroom;
	  }
	//  public void setBedroom(int bedroom) {
//	    this.bedroom = bedroom;
	//  }
	  public double getPrice() {
	    return price;
	  }
	//  public void setPrice(double price) {
//	    this.price = price;
	//  }
	  
	  public String toString() {
	    return "House [type=" + type + ", bedroom=" + bedroom + ", price=" + price + "]";
	  } 
	  
	  
	}
	/*
	  Class : 
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

		 	 what about static and non-static accessing each other ?  stay tuned 

		 	----------- things we did not learn yet --------
		 	static variable field
		 	Constructor ---- a special method being called when 				object is being created 
		 	instance initilizer block and static initilizer block 


         
	  
	  
	  
	  */


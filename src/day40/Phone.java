package day40;

public class Phone {
    
	// these instance variales 
	  // can be accessed 
	  // inside instant methods directly 
	  // just like it's a local variable 
	  // for that method 
	  
	  // if you are outside class
	  // you need an object to access 
	  /// these attributes 
	 
	
	String brand;
	String type;
	String OS ;
	int capacity;

	
	public void ring() {
		System.out.println("ringing");
		
	}
	
	public void dial (long number) {
		System.out.println("dialing" + number);
		
	}
	
	public void displayBrand() {
		System.out.println("brand : "+ brand);
	}
	
	
	
}

/*
 *  Hurmanin ornegi:
 *
      //public static void eat () {}
      //any non static method is called instance method
		
		public static void eat () {
			System.out.println("eating with STATIC");
      }
		
		public void eat2 () {
			System.out.println("eating with NO STATIC");
		}
		
		/////////////   bu da cagirma ornegi:
		
		main method { 
         
	     // Person.eat(); //works with static method
	    //Person.eat2() //cannot make static reference to a non-static method
	    
		Person p2 = new Person (); //we are creating object p2
	    p2.eat(); //object can call static and non static (instance)
	    p2.eat2(); ////object can call static and non static (instance)
}
Collapse

	*/
	



	/*
	 * Create class Phone
	 * add few instance variable to define   attribute | properties| state of object 
	 * type as String , OS as String , capacity as int 
	 * add few methods 
	 *   ring -->> accept no param return no value , just print ringing
	 *   dial -->> accept one param number as int and print dialing number 
	 * 
	 * 
	 * create 3 different phone object , iphone, sumsung , pixel 
	 * assign value for all attributes 
	 * and call methods 
	 * 
	 * OPTIONALLY 
	 *   add a behavior to Phone object  
	 *   displayPhoneInfo method accept no param return no value 
	 *   --> this should print all phone attributes 
	 *   
	 * 
	 * */ 


	
	


	   
/*	
}

package day40;

public class Phone {

  String brand;
  String OS;
  int capacity;

  public void ring() {
    System.out.println("ringing");
  }

  public void dial(long number) {
    System.out.println("dialing " + number);
  }

}



*/

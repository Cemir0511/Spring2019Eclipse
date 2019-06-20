package day39;

public class Garage {

	public static void main(String[] args) {
		
		
		 // default values for fields
	    // if it's not defined 
	    /*
	     * Any reference type field --> null 
	     * Any whole numbers type ---> 0 
	     * Any fractional numbers type --> 0.0
	     * char ----> empty char ascii 0
	     * boolean --> false  
	     * */
//	    int i ;  //value vermezsen, olmaz, any local variable has to be initialized, there is no default value for local variable 
//	    System.out.println(i);  //this does not compile, local variable needs to be initialized before usage
	//    
	    
	    Car c1 = new Car();
	    
	    c1.model    = "Toros";
	    c1.make      = "Toyota";
	    c1.year      = 2019;
	    c1.price     = 60000;
	    c1.horsePower = 200;
	    
	    System.out.println(c1.model ); //null verdi, neden cunku its not defined
	    System.out.println(c1.make );
	    System.out.println(c1.year );
	    System.out.println(c1.price );
	    System.out.println(c1.horsePower );
	    System.out.println(c1.isConvertable ); // default false
	    
	    
	    

	 // }

	//}


	}

}

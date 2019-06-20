package day38;

public class VarArgsMethods {

	public static void main(String[] args) {
		
		doSomething(4,2,4,6,6,777,8,8,8,8);
		doSomething(4,3,2);
		doSomething(4,3,4,5);
		
		
		doSomething(5);     //exact match 1. method yani
		
		doSomething(5,10);  // exact match 2. method yani
		
		
		
		
		// methodlarda butun mesele hangi methodu call edecek onu bilmek, bulmak
	    // exact match i bulmali 	
	
	}

	
	       public static void doSomething(int x) {
		    System.out.println( "doSomething(int x)" );
		    }
	       
	       public static void doSomething(int x,int y) {
			    System.out.println( "doSomething(int x, int y)" );
			    }
		       

		    public static void doSomething(int... x) {
		    System.out.println( "doSomething(int... x)" );
		    }
	
		    
		   /*Console:
doSomething(int... x)
doSomething(int... x)
doSomething(int... x)
doSomething(int x)
doSomething(int x, int y)

		    *  
		    */
	
}

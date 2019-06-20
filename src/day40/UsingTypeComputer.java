package day40;

import java.util.ArrayList;

public class UsingTypeComputer {

	public static void main(String[] args) {
		
		/*
		 * What can  we do when we have a class?  Class la neler yapabiliriz: 
		 * 
		 * Create object out of it
		 * 
		 * It will become a type
		 * Create a reference variable Computer IMac
		 * Use it as method parameter
		 * Use it as method return type
		 * Use it as type for ArrayList object
		 * 
		 * 
		 */
		
	    Computer myComputer = new Computer();  // object
	    ArrayList<String> lst = new ArrayList<>();
	    
	    ArrayList<Computer> comlst = new ArrayList<>(); // Computer class than liste
	    comlst.add(myComputer);
	    comlst.add(new Computer());
	    
	    
	    String str = new String ("actual String");
		String [] strArr = new String [3];   // array yapma
		
		Computer myComp = new Computer();
		Computer [] comArr = new Computer[3];  // fixed size array, collection type
		                                       // su an 3 null var
		
		
		printComputer( myComp);
		
	}
		 
	// we create a method that return computer object
	   public static  Computer  getComputer() {
		   // in order to return computer object
		   // first we need to create an object
		   
		   Computer iMac = new Computer ();
		   iMac.OS = "Mac OS";
		   return iMac;     // returned computer object
	   }
	    
	
	    
	   // created a methdo that accept computer as parameter
	   // so when we call this method
	   // we will pass computer object as augument 
		
		public static void printComputer(Computer comObject) {
			
			System.out.println("computer object");
		}
		
		public static void printString (String strObj) {
		
			System.out.println(strObj);
		}
		
		public static String getString () {
	    	
			return "my string";
	    	
	    }
	
	

}

package gunlukTekrarim;

import java.util.Arrays;

public class karaTahta {

	public static void main(String[] args) {
		
		
		int [] arr = new int [3];
		
		int [] arr1 = new int [8];
		  int [] ar = new int [3];
		  
		  int [] a = new int [9];
		  
		  int [] er = new int [4];
		  
		  String []  err = new String [6];
		  
		  String [] yep = new String [6];
		  
		  String [] hep = new String [8];
		  
		  String []ep = new String [5];
		  
		  String [ ] giz = {"yes", "he"};
		  
		  String [] ney = { "nere", "gele", "hele"};		  
		System.out.println(Arrays.toString(ney));
		
		 for ( String elemant : ney) {
			 System.out.println(elemant );
		 }
	   System.out.println();
	
		for ( int i = ney.length-1; i>=0; i--) {
			 System.out.println("sonuncu "+ ney[i]);
		}	 
		 
		
		 String [] names = {"John", "Adam", "Don"};
	     
		    Arrays.sort(names);
		    
		    for (String item:names){
		    
		    System.out.println("names  " + item); 
  	}}

}

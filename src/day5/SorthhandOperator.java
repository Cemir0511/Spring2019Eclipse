package day5;

public class SorthhandOperator {

	public static void main(String[] args) {
		
// shorthand operators --> it's just a shortcut 
		
		
	    int i = 10 ; 
	    System.out.println("the score is "+ i );
	    
	    //i = i + 5 ;  // i= 15 ; 
	    i += 5 ;  // shorthand operator has no space in between + =  
	    
	    System.out.println("the score is "+ i );
	    //i = i - 2 ;  // i = 13
	    i -= 2 ; 
	    
	    System.out.println("the score is "+ i );
	    
	    // TASK 2 
	    		//---> multiply i's value by 10 and assign back to i ; 
	        //---> divide i's value by 5 
	    		//---> get remainder of i's value after dividing by 7 

	    // Task 3 
	    // use shorthand operator to make this code shorter
	     i = i * 10;
         System.out.println("The score is now " + i);
         i = i / 5;
         System.out.println("The score is now " + i);
         i = i % 7;
         System.out.println("The score is now " + i);
	    

		

	}

}

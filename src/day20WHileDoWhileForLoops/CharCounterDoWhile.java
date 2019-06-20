package day20WHileDoWhileForLoops;

public class CharCounterDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a program that ask user a sentence (may or may not contain number) 
		//and store numerical and non-numerical part separately and print out the results. 
		//Also print out the count of the characters from a-z
				
		String str = "jaaaava";
		
		 // how many letter a showed up in this String
	   // String str = "Ali K Durhan";
	    
	    // go through each and every character
	    // if i see a , i will increment my counter by 1
	    
	    int count= 0 ; 
	    int x = 0;  
	        
	    do {
	      
	      char c = str.charAt(x) ; //each char at each index
	      if(c=='a' || c=='A') {
	     // if(str.equalsIgnoreCase("a")){
	        System.out.println("BINGO at " + x);
	        ++count ; //count = count + 1;  
	      }
	      //System.out.println(  + " ");
	      x++ ; 
	      
	    }while(x<str.length());
	    
	    System.out.println( count  );
	    
	    }
	
	
	    
	    
	    //birinin:
	 // How many letter "a" showed up in String
	 		String strs = "jaaaava";

	 		// go through each and every characters
	 		// if I see a ,i will increment my counter
/*
	 		int counts = 0;// my counter
	 		int a = 0;// to start iteration
	 
	 		while (a < strs.length()) {
	 			
	 			char c = strs.charAt(a); //each char at each index
	 			
	 			if (c == 'a') { //condition to check each char 
	 				System.out.println("You find 'a' "+ "at index of "+a);
	 				counts++;// count+=1;
	 			}
	 			a++;
	 			
	 		}
	 		System.out.println("Total count: "+count);
	 		*/
	


}

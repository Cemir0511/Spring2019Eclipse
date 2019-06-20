package day26;

import java.util.Arrays;
import java.util.Scanner;



public class ToCharArrayPractice {

	public static void main(String[] args) {
		
		//Task 2
		// toCharArray method is a method form String class 
	    // and it will take no external data when being called 
	    // and it will return character array that have each char of String object
	    
		Scanner scan =new Scanner(System.in);
		System.out.println("ENter ur name");
		String name=scan.next();
		
		
		
		
	    char[] nameChars = name.toCharArray(); 
	    System.out.println(Arrays.toString(nameChars)   );
	    
	    int counter=0;
	    
	    for(int i=0; i<nameChars.length;i++) {
	    	  if(nameChars[i]=='a') {
	    		  counter++;
	    		  
	    	  }
	    	
	    }
		System.out.println("the count is " + counter);
	}

}

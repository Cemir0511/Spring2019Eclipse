package day19;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TASK 1 : 
	    // Ask user to enter a sentence     
	    // if the sentence does not contains word java 
	    // keep asking user to enter 
	    
	    Scanner scan = new Scanner(System.in); 
	    
	    String theSentence = "" ; 
	    
	    while( theSentence.contains("java")== false    ) {
	      
	      System.out.println("Enter the sentence");
	      theSentence = scan.nextLine(); 
	      
	    }
	    
	    //while(! theSentence.toUpperCase().contains("JAVA")) {
	    while(! theSentence.toLowerCase().contains("java")) {
	        System.out.println("Enter the sentence");
	      theSentence = scan.nextLine();       
	    }
	    
	    
	    System.out.println(" END ");
	    
	    
	    
	    
	    
		
	}

}

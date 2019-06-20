package day20WHileDoWhileForLoops;

import java.util.Scanner;

public class SeperatorUsingLoop {

	public static void main(String[] args) {
		// java20awesome---->> javaawesome    20  
	    
	    String mix = "Aonline132x";
	    String numberStr = "";  
	    
	    int i = 0 ; 
	    
	    while(i< mix.length()) {
	      
	      char c = mix.charAt(i); 
	      
	      if( c>= '0' && c<= '9' ) {
	        //System.out.println(c);
	        numberStr = numberStr + c ; 
	      }
	      
	      i++ ; 
	    }
	    
	    int y = 0 ; 
	    do {
	      
	      char c = mix.charAt(y);
	      
	      
	      if(c  >= 'a' && c  <= 'z') {
	        System.out.println(c);
	        
	      }
	      y++; 
	      
	    } while (y< mix.length());
	    
	    
	    System.out.println(  numberStr );
	    
	//    
	//    
	//    
	//    
//	    // check whether c is between 0 - 9 
//	    //if( c>= 32 && c<= 41 ) {
//	      
//	    if( c>= '0' && c<= '9' ) {
//	      System.out.println("NUMBER!!");
//	    }else {
//	      System.out.println("NOT NUMBER!!");
//	    }
	//    
//	    if( c>= 'A' && c<= 'Z' ) {
//	      System.out.println("UPPERCASE!!");
//	    }else {
//	      System.out.println("NOT UPPERCASE!!");
//	    }
	//    
	    
	    
	    
	    

		
		// java20awesome---->> javaawesome    20  
	    
	    String mix1 = "Aonline132x";
	    String numberStr1 = "";  
	    
	    int i1 = 0 ; 
	    
	    while(i1< mix1.length()) {
	      
	      char c = mix1.charAt(i1); 
	      
	      if( c>= '0' && c<= '9' ) {
	        System.out.println(c);
	        numberStr1 = numberStr1 + c ; 
	      }
	      
	      i1++ ; 
	    }
	    System.out.println(  numberStr1 );
	    
	//    
	//    
	//    
	//    
//	    // check whether c is between 0 - 9 
//	    //if( c>= 32 && c<= 41 ) {
//	      
//	    if( c>= '0' && c<= '9' ) {
//	      System.out.println("NUMBER!!");
//	    }else {
//	      System.out.println("NOT NUMBER!!");
//	    }
	//    
//	    if( c>= 'A' && c<= 'Z' ) {
//	      System.out.println("UPPERCASE!!");
//	    }else {
//	      System.out.println("NOT UPPERCASE!!");
//	    }
	//    
	    
		
		
		
		
		
		
		
		//Birinin:
	    Scanner scan=new Scanner(System.in);
		String word  =scan.next();
	   
	    int x = 0;
	    String newWord = "";
	    while (x<word.length()) {
	    	
	    	char c = word.charAt(x);
	    	if (!(c>='0' && c<='9')) {
	    		newWord = newWord+word.charAt(x);
	    	}
	    	x++;		
	    }
	    
	    System.out.println(newWord);
		
	}

}

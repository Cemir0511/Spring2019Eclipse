package day23;

public class WarmUpGetUniqueTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Early warm up tasks from what we already learned in class---
1, write a program to reverse a string
2, write a program to find all occurrence of certain character or word
3, write a program to count all occurrence of certain character or word
4, write a program to get the sum of numbers from 1 to a number user specified
5, write a program to extract lowercase letter from a given String — a1b2c3 --> abc
6, write a program to get unique characters from a string  : aaabbccc —> abc

	     * write a program to get unique characters from a string  
	     * : aaabbccc —> abc
	     * */
	    String str = "aaabbccc" ; 
	    String uniqueStr = "" ; 
	    
	    for (int i = 0; i < str.length(); i++) {
	      
	     String eachChar = str.substring(i, i+1) ; 
	     
	     System.out.print(eachChar); ///buraya kadar olan yerde 
	                              //full print eder ne varsa
	      
	    // if(! uniqueStr.contains(eachChar) ) { // daha ilerisi icin 
	    	                                     //sadece abc print oldu
	    	                                 //tekrarli harfler cikmadi
	    	 
	     //  uniqueStr += eachChar ; 
	     // System.out.println(eachChar);
	    	
	    
	      }
	      
	     // System.out.println(eachChar);
	    
	    
	      
	    
	}
}
		
		
	


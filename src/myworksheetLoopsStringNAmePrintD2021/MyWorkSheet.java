package myworksheetLoopsStringNAmePrintD2021;

import java.util.Scanner;

public class MyWorkSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//how many letter a showed up in this string:
	/*	String strs = "ZelihaaaaaAAa";
		int counts=0;
		int y=0;
		
		do {
			char c= strs.charAt(y);
			if(c=='a'||c=='A')
				System.out.println("there is letter a at "+y );
			counts++;
		
	}while(y<strs.length());
	*/
		

		
		
		
	System.out.println();
		String str = "jaaaava";
		 int count= 0 ; 
		    int x = 0;  
		        
		    do {
		      
		      char c = str.charAt(x) ; //each char at each index
		      if(c=='a' || c=='A') {
		     
		        System.out.println("BINGO at " + x);
		        ++count ; //count = count + 1;  
		      }
		      
		     x++ ; 
		      
		    }while(x<str.length());
		    
		    System.out.println( count  );
		    
		    }
		
	
	
		
	
     
	

	

}

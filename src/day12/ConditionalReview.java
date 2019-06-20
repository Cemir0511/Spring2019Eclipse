package day12;

import java.util.Scanner;

public class ConditionalReview {

	public static void main(String[] args) {
		
		//any ternary operator can be turned into if else statement
		//ne and only purpose of ternary op is conditional assignmnet
		
		//Task 1
		//check for weather equal to sunny or not
		//and assign the value of --if sunny assign action value to go out
		//if not assign action value to stay home
		
		//print out your action at the end after the statement
		
		//optional:try to check for multiple condition of sunny/cloudy/rainy/windy
		
		
		String weather  ;  // get the weather value from scanner  
		String action ; 
		// TASK 1
		/*
		 * 
		 * check for weather equal to sunny or not 
		 * and assign the value of --if sunny assign action value to go out 
		 * if not assign action value to stay home 
		 * 
		 * print out your action after the statement 
		 * 
		 * optional : try to check for multiple condition of sunny/cloudy/windy/rainy/
		 * 
		 * */
		
		  Scanner s = new Scanner(System.in);
		  
		  System.out.println("how is weather today?");
		  
		  weather=s.next();
		  
		  /// ALWAYSE USE  str1.equal(str2) for String equality check 
		  
//		  if(weather.equalsIgnoreCase("sunny")){
//		  //if( weather.equals("sunny") ){
//			  action = "go out";
//		  }else{
//			  action =  "stay home";
//		  }
		  
		 
		 // action = ( weather.equals("sunny") ) ? "go out" : "stay home" ; 
		  action = ( weather.equalsIgnoreCase("sunny") ) ? "go out" : "stay home" ; 
			
		  
		System.out.println("THE ACTION according to weather is : " + action);
		
		

	}


		
		
		
		
		
		
		
		
	}

}

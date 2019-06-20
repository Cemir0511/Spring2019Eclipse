package abc;

import java.util.Scanner; //bu olmadan olmaz, once scanner i import edeceksin 
                           //sisteme..import scanner class to define the location

public class ScreenIntro{
	
	public static void main (String[] args) {
		
		//create a scanner object:
		
		Scanner userInput = new Scanner (System.in);
		         // bu any variable olabilir useInput yazan
		
	 
	  
		//ask questions:
		
		System.out.println("enter your name please:");
		
		//store use input 
		//next() method will read only one word
		// nextLine will read your whole line
		//String name= userInput. next();
		
		String name= userInput. nextLine();
		
		//print what user input
		
		System.out.println("You have entered : " + name);
		
	
		
		
	}
	

}

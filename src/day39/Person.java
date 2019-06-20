package day39;

import java.util.Random;
import java.util.Scanner;

public class Person {

	
	// properties of the object are defined by instance variables
	// right under the class, outside of any method, we define all the person
		
	//by instance variable /field
	
	String name ; 
	int age;
	char gender;
	
	
	
	///   Now adding behavior:
	
	//public static void eat() {
	  // any non-static method is called instance method 
	  public void eat() {  // no static keyword olan instance methoddur
		                   // static keyword olmadigi icin (yani dynamic gibi dusun), object almali:
	    
	    System.out.println(" eating ");  
	    
	  }
	  
	  public void walk() {               // another instance method, static degil cunku
		  System.out.println("Walking");
	  } 
		  public void go() {
		  System.out.println("going");
	  }
	  
	  public void tellMeYourName() {    //another instance method , action
	    System.out.println("My Name is " + name);
	  }
	  
	public void printPersonInfo() {
		System.out.println(("My name is: ")+ name 
				+ "| My age is: " 
				+ age + "|My gender is:"
				+ gender);
	}
	
	
	
//	public static void main(String[] args) {
		
		
		
		
		
		/*
		 * Horse:
		 * 
		 *     properties: color, age, breed
		 *  
		 *     behavior(action): jump, eat, run, kick, release
		 *  
		 * Person:
		 * 
		 *     properties: name, age, gender
		 *  
		 *     behavior: eat, study java, laugh, sleep
		 * 
		 */
		
		
		
		
		String str = new String ("abc");
		Scanner scan = new Scanner(System.in);

		Random ran= new Random (); //we can create an object out of random class
		
		
		
		
		
		
		
		
//}

}

package day20WHileDoWhileForLoops;

import java.util.Scanner;

public class WarmUp20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*ENTER USERNME & PASSCD UNTIL GET THE CORRECT
	     * while( some condition is true){
	     *     action to be repeated
	     * }
	     * 
	     * do{
	     *     action to be repeated
	     * }while(some condition is true); 
	     * 
	     * */
	    
	    String name = ""; 
	    String pass = "";
	    Scanner scan = new Scanner(System.in); 
	    

	    while(  !( name.equals("abc")&& pass.equals("123") ) ) {
	      
	      System.out.println("Enter username : ");
	      name = scan.next(); 
	      System.out.println("Enter Password : ");
	      pass = scan.next(); 
	      
	    }
	    
	    
//	    do {
//	      
//	      System.out.println("Enter username : ");
//	      name = scan.next(); 
//	      System.out.println("Enter Password : ");
//	      pass = scan.next(); 
	//
//	    }while(  !( name.equals("abc")&& pass.equals("123") ) ) ; 
	    
	    System.out.println("END");
	    
	  }

	

	}



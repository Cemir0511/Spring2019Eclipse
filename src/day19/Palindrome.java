package day19;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		    System.out.println("ENTER A name");
		    // Ask user a name 
		    // for example  Bilal ----> B-i-l-a-l-
		    String name = scan.nextLine() ;
		    /// USING ABOVE CODE --> CREATE A PROGRAM 
		    // TO CHECK WHETHER A WORD IS PALINDROM 
		    //    ANA --> REVERSE -- ANA
		    //    CIVIC --> REVERSE -- CIVIC

		    int count = name.length() ;  // ABC 
		    String reversed = ""; 
		    
		    while(count>0) {

		      count-- ; 
		      reversed  = reversed + name.charAt(count) ; 
		      //reversed += name.charAt(count)
		      System.out.println( reversed  );      
		      
		    }
		    System.out.println( "PALINDROME " + name.equals(reversed) );
		    
		    
		 //Palindrome:::::::
		    //Scanner scan = new Scanner(System.in);
		    System.out.println("ENTER A name");
		    // Ask user a name 
		    // for example  Bilal ----> B-i-l-a-l-
		    String names = scan.nextLine() ;
		    /// USING ABOVE CODE --> CREATE A PROGRAM 
		    // TO CHECK WHETHER A WORD IS PALINDROM 
		    //    ANA --> REVERSE -- ANA
		    //    CIVIC --> REVERSE -- CIVIC

		    
		    // in order to reverse a String 
		    // we can start getting the chars in reversed order 
		    // by using charAt method 
		    // since the order is decrementing , we use -- 
		    // in order to save the reversed word, we need a container
		    // before we reverse the word , just put empty value in container
		    // while we looping through each chars , 
		    // concatenate this character to the variable value 
		    // after the loop we will have the word stored in reversed order
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    //System.out.println();
//		    System.out.print(name.charAt(0)+"-");
//		    System.out.print(name.charAt(1)+"-");
//		    System.out.print(name.charAt(2)+"-");
//		    System.out.print(name.charAt(3)+"-");
//		    System.out.print(name.charAt(4)+"-");
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    //System.out.println();
//		    System.out.print(name.charAt(0)+"-");
//		    System.out.print(name.charAt(1)+"-");
//		    System.out.print(name.charAt(2)+"-");
//		    System.out.print(name.charAt(3)+"-");
//		    System.out.print(name.charAt(4)+"-");
		    
		    
		    //Scanner scan = new Scanner(System.in);
		    //System.out.println("ENTER A name");
		    // Ask user a name 
		    // for example  Bilal ----> B-i-l-a-l-
		    //String name = scan.nextLine() ;
		    
//		    int x = 0 ; 
//		    while(x< name.length() ) {
//		      
//		      System.out.print (  name.charAt(x)  + "-");
//		      ++x ;   //x++ ; 
//		    }
		    // TASK 3 : referring above code --> reverse your name 
		    // OPTIONAL : Check how many a do you have in your name
		    int counts = name.length() ;  // ABC 
		    while(counts>0) {

		      count-- ; 
		      System.out.print( name.charAt(count) + " "   );      
		      
//		      System.out.print( name.charAt(count-1) + " "   );
//		      count-- ; 
		    }
		    /// USING ABOVE CODE --> CREATE A PROGRAM 
		    // TO CHECK WHETHER A WORD IS PALINDROM 
		    //    ANA --> REVERSE -- ANA
		    //    CIVIC --> REVERSE -- CIVIC
		    
		    
		    
		    
		    
		    
		    
		    
		
	}

}

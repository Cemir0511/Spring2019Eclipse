package day19;

import java.util.Scanner;

public class LoopingChars {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);

	    String str = scan.next();
	    // how to check whether string start with a-z
	    
	    char firstChar = str.charAt(0);

	    //ABC System.out.println('a' > 'b');

	    if (firstChar >= 'a' && firstChar <= 'z') {
         //str.charAt(0)        //str.charAt(0)
	      System.out.println(" lower case letter");

	    } else {

	      System.out.println("NOT a-z");
	    }	
		
	    
	  //TASK 2
	    //create a program like above
	    //to check whether user input first character
	    //1, started with number
	    //2. end with uppercase
		
	}

}

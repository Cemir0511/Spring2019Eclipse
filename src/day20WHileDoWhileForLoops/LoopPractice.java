package day20WHileDoWhileForLoops;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in); 
	    //String name = scan.next(); 
	    
	    // Task 1 :
	    // print our name char by char using do while loop 
	    // Hurma --> H u r m a 
	    // use do while loop
	    
//	    String fUp = name.substring(0,1).toUpperCase(); 
//	    String expected = fUp + name.substring(1); 
	//    
//	    System.out.println( expected);
	    //char c = name.charAt(0); 

//	    System.out.println(name.charAt(0)+""+name.substring(1));
	    String name="Hurma";
	    int x=0;
	    do {
	     System.out.print(name.charAt(x)+ " "); 
	     x++;
	    
	    }while(x<name.length());
	    
	   // System.out.println(name.charAt(0)+  " ");
	   // System.out.println(name.charAt(1)+  " ");
	    //System.out.println(name.charAt(2)+  " ");
	   // System.out.println(name.charAt(3)+  " ");
	    //System.out.println(name.charAt(4)+  " ");
	    }
	    
	    /*System.out.println("User Name: ");
	    int i=0;
		String name = scan.next();
	    
	    do {
	    	
	    	System.out.print(name.charAt(i)+" ");
	    	i++;
	    }while (i<name.length());
	    */
		
	

}

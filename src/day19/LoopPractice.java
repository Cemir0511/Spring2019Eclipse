package day19;

import java.util.Scanner;

public class LoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ask user a word 
	    // for example  Bilal ----> B-i-l-a-l-
	    String name = "Bilal" ;
	    
	    //System.out.println();
//	    System.out.print(name.charAt(0)+"-");
//	    System.out.print(name.charAt(1)+"-");
//	    System.out.print(name.charAt(2)+"-");
//	    System.out.print(name.charAt(3)+"-");
//	    System.out.print(name.charAt(4)+"-");
	    
		
		System.out.println();
	    int x = 0 ; 
	    while(x<5) {
	      
	      System.out.print (  x  + "-");
	      x++ ; 
	    }
	    
	    Scanner scan = new Scanner(System.in);
	    System.out.println("ENTER A name");
	    // Ask user a name 
	    // for example  Bilal ----> B-i-l-a-l-
	    String myname = scan.nextLine() ;
	    
	    int a = 0 ; 
	    while(a< myname.length() ) {
	      
	      System.out.print (  myname.charAt(a)  + "-");
	      ++a ;   //x++ ; 
	    }
	    
	    /*Bekar's:palindrome:
	     * Scanner scan = new Scanner(System.in);
        System.out.println("Enter a palindrome word: ");
        String pal = scan.next();
        String reverse = "";
        int num = pal.length() - 1;
        while (num >= 0) {
            reverse = reverse + pal.charAt(num);
            num--;
            if (reverse.equalsIgnoreCase(pal)) {
                System.out.println("Plaindrome");
            } else {
                System.out.println("Not palindrome");
            }
	     * 
	     * 
	     */
	    
	    
	    
	    
	    //System.out.println();
//	    System.out.print(name.charAt(0)+"-");
//	    System.out.print(name.charAt(1)+"-");
//	    System.out.print(name.charAt(2)+"-");
//	    System.out.print(name.charAt(3)+"-");
//	    System.out.print(name.charAt(4)+"-");
	    
	    
	    
	}

}

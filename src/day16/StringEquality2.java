package day16;

import java.util.Scanner;

public class StringEquality2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abc" ;   // using string literal 
		Scanner s = new Scanner(System.in) ; 
		String s2 =  s.next();  //new String("abc") ;  // using new keyword

		System.out.println(  s1==s2  );
		
		String s3 = "abc" ; 
		
		System.out.println(   s1== s3   );
		
		
		// SCP == STRING CONSTANT POOL ---->>> STRING POOL 
		
		// string pool is a special location inside heap 
		// to store unique string literal 
		
		
		
		
		
		
	}

}

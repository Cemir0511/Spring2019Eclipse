package day16;

import java.util.Scanner;

public class endsWith {

	public static void main(String[] args) {
		
		
	/*	// str.indexOf("bc")==0 ====>>> str.startWith("bc")
		public static void main(String[] args) {

			String str = "Odiljan";

			boolean yesOrNo = str.endsWith("no");

			//System.out.println(yesOrNo);

			// Task :
			// ask for user to enter a name
			// 1, check whether the name started with A
			// and ended with x
			// 2, get the last index of letter a

			Scanner s = new Scanner(System.in);

			System.out.println("Enter your name:");
			String name = s.nextLine();
			
			boolean bool1 = name.startsWith("A");
			boolean bool2 = name.endsWith("x");
			
			//if(bool1) {    }
			//if(bool1==true) {    }
			if( bool1 && bool2   ) {
				System.out.println("the name matches");
			} else {
				System.out.println("no macth");
			}
			
			System.out.println(   name.lastIndexOf("a")      );
			

			// OPTIONAL :
			// 3,
			// if the name has more than 2 character do these
			// get the middle letter
			// if the name has odd length get single char
			// if the name has even length get both chars

			// Adam ---> da
			// Johny ---> h
			
			int count = name.length() ; 
			
			if(count>2) {
				
				
				if(count % 2==1) {
					 //01234   5 character      a
					// Adaam   5/2=2 
					
					int midIndex = count/2 ; 
					System.out.println(  name.charAt(midIndex)  );
					
				}else {
					// 012345  6 chars   hm
					// mehmet  6/2 -->  3   
					int midIndex = count/2 ; 
					char midR = name.charAt(midIndex);
					char midL = name.charAt(midIndex-1);

					System.out.println(""+midL + midR );
				*/
		
		// str.indexOf("bc")==0 ====>>> str.startWith("bc")
		
			String str = "Odiljan";

			boolean yesOrNo = str.endsWith("no");

			//System.out.println(yesOrNo);

			// Task :
			// ask for user to enter a name
			// 1, check whether the name started with A
			// and ended with x
			// 2, get the last index of letter a

			Scanner s = new Scanner(System.in);

			System.out.println("Enter your name:");
			String name = s.nextLine();
			
			boolean bool1 = name.startsWith("A");
			boolean bool2 = name.endsWith("x");
			
			//if(bool1) {    }
			//if(bool1==true) {    }
			if( bool1 && bool2   ) {
				System.out.println("the name matches");
			} else {
				System.out.println("no macth");
			}
			
			System.out.println(   name.lastIndexOf("a")      );
			

			// OPTIONAL :
			// 3,
			// if the name has more than 2 character do these
			// get the middle letter
			// if the name has odd length get single char
			// if the name has even length get both chars

			// Adam ---> da
			// Johny ---> h
			
			int count = name.length() ; 
			
			if(count>2) {
				
				
				if(count % 2==1) {
					 //01234   5 character      a
					// Adaam   5/2=2 
					
					int midIndex = count/2 ; 
					System.out.println(  name.charAt(midIndex)  );
					
				}else {
					// 012345  6 chars   hm
					// mehmet  6/2 -->  3   
					int midIndex = count/2 ; 
					char midR = name.charAt(midIndex);
					char midL = name.charAt(midIndex-1);

					System.out.println(""+midL + midR );
					
		
				
				
				
				
			

		}

	}
				
		
		
		
			
			
		}
		
		
		
		
	}

	


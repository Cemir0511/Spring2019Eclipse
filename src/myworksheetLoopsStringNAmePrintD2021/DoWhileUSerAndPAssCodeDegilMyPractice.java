package myworksheetLoopsStringNAmePrintD2021;

import java.util.Scanner;

public class DoWhileUSerAndPAssCodeDegilMyPractice {

	public static void main(String[] args) {
		
		
		
		String name="";
		String passcode="";
				
				Scanner scan = new Scanner (System.in);
		
				
		do {
			System.out.println("Enter name: ");
			name=scan.next();
			System.out.println("Enter passcode: ");
			passcode=scan.next();
			
			
		}while( ! (name.contentEquals("abc") && passcode.equals("123")));
		
		System.out.println("Welcome!!");
				
				
				
				
	}

}

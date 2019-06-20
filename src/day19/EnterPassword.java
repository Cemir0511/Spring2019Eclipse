package day19;

import java.util.Scanner;

public class EnterPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String password = "abc123";
		String input;

		do {
			System.out.println("Enter first password");
			input = scan.next();
		}while(!input.equals(password));
		//if input is not same as password, keep asking to enter

		
		
		String paw = "123";
		
		do {
			System.out.println("Enter new password: ");
			paw = scan.next();
			
		}while (! paw.equals("123"));
		
		System.out.println("welcom!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		String pw = "abc";
		String us = "123";
		
		
		
		do {
			System.out.println("Enter password");
		    pw = scan.next();
		    System.out.println("Enter user");
			us = scan. next();
			
			}while (! (pw.equals("abc") && us.equals("123"))  );
	System.out.println("Welcome!!");	
	}
	
}

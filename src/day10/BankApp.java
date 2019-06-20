package day10;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Cybertek Banking App");

		long accountNumber = 12345L;
		String userPassword = "abc123";

		System.out.println("Enter your account number:");
		long account = scan.nextLong();
		// scan.nextLine();

		System.out.println("Enter your password:");
		String password = scan.next();
		
		/// in order to check primitive type equality 
				//you should always use ==
		// for String you should always use .equals method 
		
		// if you have single line of statement under your if or else 
			// curly braces are optional 
		
		if (accountNumber == account && userPassword.equals(password))
			System.out.println("login success!");
		else
			System.out.println("login failed!");
			
		System.out.println("end");
		
	}

}

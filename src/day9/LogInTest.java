package day9;

import java.util.Scanner;

public class LogInTest {

	public static void main(String[] args) {
		
		String username = "user";
		String password = "abc123";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter username:");
		username = scan.next();
		
		System.out.println("Enter password:");
		password = scan.next();
		
		boolean userExists = username.equals("user") ;
		boolean passwordCorrect = password.equals("abc123") ; 
			// true  && true
		//if(userExists && passwordCorrect)
		//if(userExists==true && passwordCorrect==true)
		if (username.equals("user") && password.equals("abc123") )
		//if(!true)
			System.out.println("Login successful");
		else
			System.out.println("Login failed");
		
		scan.close();
		

		
	}

}

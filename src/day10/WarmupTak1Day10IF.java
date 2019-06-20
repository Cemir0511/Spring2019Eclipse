
package day10;

import java.util.Scanner;

public class WarmupTak1Day10IF {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
	
	
	long accountNumber =1212121L;
	String userpassword ="abcde";
	System.out.println("Enter your account number:");
	Long account = scan.nextLong();
	System.out.println("Enter your passcode:");
	String password = scan.next();
	if (accountNumber ==account && userpassword.equals(password)) {
	System.out.println("login success");
	}else {
	System.out.println("login failed");
	}
	
	
	
	
	
	
	
	}

}

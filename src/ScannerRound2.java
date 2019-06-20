import java.util.Scanner;


public class ScannerRound2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		
		//asking user questions 
		System.out.println("Enter your first name:");
		
		//force user to enter input/data:
		String firstName = input.next();
		
		//and format the display output:
		System.out.println( "Enter your last name" + firstName);
		
		//let  or force user to put input here:
		String lastName = input.next();
		
		//format display again:
		System.out.println("Your last name is" + lastName);
		
		System.out.println("Your full name is" + firstName+ " " + lastName);
		
		
		

	}

}

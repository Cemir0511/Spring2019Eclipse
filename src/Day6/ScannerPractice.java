package Day6;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		
		// creating scanner object
				Scanner input = new Scanner(System.in);  
			
				// ask user questions 
				System.out.println("Enter your mood today : ");
				
				// save user input into String
				String mood = input.next();  // This will only pick up a word as Sring 
				input.nextLine();  /// this will take care of <Enter> you have clicked
				
				// ask user questions 
				System.out.println("Enter your location today : ");
				// save user input into String
				String location = input.nextLine();
				
				// outoput something meaningful 
				System.out.println("Your mood Today is : " + mood );
				System.out.println("Your location is : " + location);
				
				// close scanner after usage 
				input.close();

	}

}

package day10;

import java.util.Scanner;

public class VariableAssignmentBeforeUsage {

	public static void main(String[] args) {
		
		
		// local variables must be assigned to a value before usage
				// If local variable has a single chance 
					//to not get a value before usage , 
					// compiler will not compile the code 
				
				
				int i = 0 ; 
				Scanner scan = new Scanner(System.in); 
				
				System.out.println("Do you want to give value to i : ");
				String yesNoAnswer = scan.next() ; 
				
				//if(yesNoAnswer.equals("yes")){
				if(yesNoAnswer.equalsIgnoreCase("yes")){
					
					System.out.println("YOU SAID YES");
					System.out.println("Enter your number");
					
					i = scan.nextInt() ; 
				}else{
					System.out.println("YOU SAID NO");
				}
				
				System.out.println("The value of i : "+  i );
				

	}

}

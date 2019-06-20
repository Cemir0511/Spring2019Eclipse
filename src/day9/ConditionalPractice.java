package day9;

public class ConditionalPractice {

	public static void main(String[] args) {
		
int i = 10 , j = 21 ; 
		
		// TASK 2 
			// write if statement to check if i is more than 5 
			// and j is odd number 
		
			// Optional add one more condition to your if statement 
			// to check sum of i and j is 31 
		//  true    false
		if( (i>5) && (j%2==1) && (i+j==31)     ){
			
			System.out.println("BINGO !!!");
			
		}else{
			
			System.out.println("Try again spartans");
		}
		
		
		// i is more than 5 or j is odd number or sum is 30 
		if( (i>5) || (j%2==1) || (i+j==30)     ){
			
			System.out.println("BINGO !!!");
			
		}else{
			System.out.println("Try again spartans");
		}

	}

}

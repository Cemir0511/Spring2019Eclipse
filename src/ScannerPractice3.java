import java.util.Scanner;
public class ScannerPractice3 {

	public static void main(String[] args) {
		
		int i =10;
        //creating scanner object
		Scanner input= new Scanner(System.in);
		
		//ask user question
		System.out.println("Enter your mood today: ");
		
		
		//save user input into String
		String mood = input.next();//this will only pick up a word as stringf
		
	input.nextLine(); //this will take care of Enter u have clicked
	
	    //ask more
		System.out.println("enter your location today");
		
		//store the location into String as well
		String location = input.nextLine();
		
		
		//output something meaningful
		System.out.println("Your mood today is : "+ mood);
		
		System.out.println("your location is: " + location);
		
		//shortcut for sout  sout = control +space
		//close scanner after usage
		input.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

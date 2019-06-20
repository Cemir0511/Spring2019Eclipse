package day5;

public class ScannerIntro {

	public static void main(String[] args) {
		
		// Create a Scanner object 
				Scanner userInput = new Scanner(System.in);
				
				// ask user questions 
				System.out.println(" Enter your name please : ");
				
				// store user input 
				/// next() method will read one word 
				//String name = userInput.next() ; 
				/// nextLine() method will read one whole line 
				String name = userInput.nextLine() ;
				
				// print what user input 
				System.out.println( "You have entered : "+ name );
				
		
	}

}

package day9;

public class StringEquality {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter your name please : ");
		
		String name = scan.next(); 
		String expectedName = "Tahir" ; 
		
		//boolean b =  (name == "Lachyn"); 
		// we use method from String class called equals 
		
		//boolean nameEqualToExpected = name.equals("Tahir"); 
		boolean nameEqualToExpected = name.equals( expectedName ); 
		
		
		
		if(nameEqualToExpected){
		//if( name.equals("Tahir") ){
			System.out.println("That's Tahir");
		}else{
			System.out.println("NOT HIM !!");
		}
		
		// TASK 2 
		// Create a name variable to store your name 
		// CREATE A SCANNER TO ASK FOR A NAME 
		// compare the name with what you entered 
		// print out thats my name if it's equal 
		// print out thats not my name if its not 
		
		
	}

}

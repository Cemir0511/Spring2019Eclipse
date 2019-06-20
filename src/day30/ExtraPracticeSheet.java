package day30;
public class ExtraPracticeSheet {

	
	
	public static void main(String[] args) {
		
		buildEmail("Zeliha", "Kocak");
		System.out.println(buildEmail("Zeliha","Kocak"));
		
		printTheDoubleNumber(4);
		checkForAge(21);
		checkForAge(11);
		
		goIn(45);
		reportName( "Ayse", "Fatma");
		
		addAllNumbers(9,4,91);
		
		
	}
	
	public static void reportName(String firsName, String lasName) {
		System.out.println("length: "+firsName.length()+"," +lasName.length());
		System.out.println(firsName.charAt(0)+lasName);
	}

	
	public static String buildEmail (String firstName,String lastName) {
		
		String email= firstName.toLowerCase()+ "_"+lastName.toLowerCase() + "@gmail.com";
		return email;
		
	}
	
	public static void printTheDoubleNumber(int a) {
		int b = a*2;
		System.out.println(b);
		
	}
	
	public static void checkForAge(int x) {
		if (x>10) {
			System.out.println("adult");
		}else {
			System.out.println("not adult");
		}
	
			
		}
	public static void goIn (int y) {
		
		int p=y*2;
		if (p>50) {
			System.out.println("senior");
		}else {
			System.out.println("not senior");
		}
			
		
	}
	public static void addAllNumbers(int a, int b, int c) {
		
		int sum= a+b+c;
		System.out.println(sum);
		
	}
	
	// create a method called reportName
	// this method take 2 String parameters as firstName, lastName
	// return nothing
	// in the body --> 
	// print the length of first and lastName with nice message 
	// print the first initial of first and lastName together 
    //create a method called addAllNumbers
	//it takes 3 numbers and get the sum of the numbers
	
	
}

//Task 2 
/* 2.1
 * create a static method with no return type
 * called printTheDoubledNumber
 * it takes 1 int as parameter
 * and it will print out doubled number on the console
 * 
 * 2.2 
 * create another static method with no return type
 * called checkForAge 
 * it takes 1 int age as parameter
 * inside body , check whether the age is more than 18 
 * if the age is more than 10 --> print adult 
 * if not print not an adult  
 * */
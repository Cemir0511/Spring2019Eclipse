package day30;

public class TaskwithTwoExternalParameters {

	public static void main(String[] args) {
		reportName("Zeliha","Kocak"); // length leri verdiz_k verdi.. 
		addAllNumbers(3,5,7); //sum verdi 15
		reverseString("EmirimCemalim"); //ters yazdi
		reverseString("Kemalim");
		reverseString("AnacimAblacim");
		reverseString("CanimAilem");
			
	}
	public static void reportName (String firstName,String lastName) {
		
		System.out.println(firstName.length());
		System.out.println((lastName.length()));
		
		System.out.println(firstName.charAt(0) +" - " + lastName.charAt(4));		
		
	}
	
	public static void addAllNumbers(int a, int b, int c) {
		int sum =a+b+c;
		
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
	
	
	//REVERSE YAPMA yazdirma reverse:
	public static void reverseString(String str) {
		
		for(int i=str.length()-1; i>=0; i--) {
			
			System.out.print(str.charAt(i));
		}
	System.out.println(); //tek tek , line by line yazdirir, ayri ayri
	}

}

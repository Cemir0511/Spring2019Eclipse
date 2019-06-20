package day19;

import java.util.Scanner;

public class Palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word to test:");
		             //0123
		String word = scan.next();
		String reversed = "";
		//loop through word in reverse order and 
		//concetanate each character to reversed string

		int idx = word.length()-1;
		while(idx >= 0) {
			reversed = reversed + word.charAt(idx);
			idx--;
		}

		System.out.println(reversed);
		//compare if word and reversed are equal
		if(reversed.equalsIgnoreCase(word)) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("It is not palindrome");
		}
		
		
		////
		String name = "Zeliha";
		String reversedd = "";
		int index= name.length()-1;
		
	do {
		System.out.println("Enter name again");
		name = scan.next();
		
	}while(! name.equals("Zeliha"));
	System.out.println("Perfect!");	
	
	System.out.println();
	
	////  give me 5:
	

	int num= 0;
	do {
		System.out.println("Enter number: ");
		num = scan.nextInt();
		
	}while (num!=5);
	
	System.out.println("Great job!!");
	
	
	
	
	
	}
	

}

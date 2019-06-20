package day30;

import java.util.Scanner;

import day29.Spartans;

public class Utility {

	public static void main(String[] args) {
		
//printUsersName();...taking no external data, parantez bos
		printUsersName(); //calling method
		Utility.printUsersName(); //calling method
		
//Arrays.sort(arrObject);
Spartans.holdYourHorse();//burda import et spartans class i der uyari!!
	                   //ayni package icersindeyse, import etmen gerekmez!
		               //burda className kullanmak zorunlu
		               //main methodda call etmis olduk, sonda print oldu
	                  //ama arrayden bir class call edemeyiz, 
	                  //cunku sadece main method var, benim bir methodum yok o tarz
                      //yani ayni type class varsa baska yerde onu call edebilirsin

	    // We can call methods coming from 
	    // different classes 
	    // if the class is under same package no import needed
	    // if the class is under different package import is mandatory
//Aslinda hep yapiyoruz..Arrays.sort da mesela..
	}
	
	public static void printUsersName() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your name please");
		
		String name=scan.next();
		System.out.println("You entered: " + name);
		
	}
	


}

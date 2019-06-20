package day29;

import java.util.Scanner;

public class MethodWithParamter2 {

	public static void main(String[] args) {
		
		//method that thakes external data..yani paramater..
		//when u call them u call the objects ..names..
		
		//Arrays.sort(arr);
		holdYourHorse("Anar");
		//holdYourHorse(12321);  // does not compile if datatype not match
		holdYourHorse("Kemal");
		holdYourHorse("Zeliha");
		holdYourHorse("Cemal");
		holdYourHorse("Melih");
		
		Scanner scan = new Scanner(System.in); //scanner dan da alabilirsin 
		String name= scan.next();               //string isteyip string verdikce ok 
		System.out.println("HOLD WHOSE HORSE?");
		holdYourHorse(name);

	}

	                                //parameter
	public static void holdYourHorse(String owner) {
		//String owner = "Anar";
		System.out.println(owner + " , hold your horse please!");
	}
}

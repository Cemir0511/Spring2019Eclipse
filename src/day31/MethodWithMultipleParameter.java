package day31;

import java.util.Scanner;

public class MethodWithMultipleParameter {

	public static void main(String[] args) {
	
		//one parameter string, one int..sekli:
		
		moreandmore("OgullarimCemalVeMelih", 100);
		
		moreRepeat("Zeliha", 30);
		
		repeat("java", 5);
		repeat ("spartan", 300);
		
		  //////u can get it from user as well
		///instaed of hardcoding
		
		Scanner scan =new Scanner(System.in); //scanner main method da olacak
		System.out.println("Give me word to repeat");
		String str = scan.next();
		System.out.println(("Give me number of time to repeat"));
		int i=scan.nextInt();
		
		repeat(str,i); //scanner sistemini kurup, parameter i ayni buraya yaz
		
		
		//repeat(); bunlarin hicbiri compile etmez, cunku 1 string 1 int sartmetodda yazildigi uzere
		//repeat("abc");
		//repeat ("abc", 123,7662, true)
		
	}
	
	public static void repeat (String word, int num) {
		for (int i=1; i<=num; i++) {
			
		System.out.println(word+ " ");
		}
	}
	
	public static void moreRepeat (String word, int num) {
		for (int x = 1 ; x <=num; x++) {
			System.out.print(word+ ",");
		}
	}
	
	public static void moreandmore (String sons, int many) {
		 for ( int y =1; y<=many; y++) {
			 System.out.println(sons + "!");
		 }

		
	}
	

}

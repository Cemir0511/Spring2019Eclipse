package day11;

import java.util.Scanner;

public class WarmUp_Bad_Logic {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		if (num % 5 == 0) {

			System.out.println("fizz");

		} else if (num % 3 == 0) {

			System.out.println("buzz");

		} else if (num % 3 == 0 && num % 5 == 0) {
			
			System.out.println("fizz buzzzz");
		
		} else {
			System.out.println("NOT A FIZZ BUZZ NUMBER");
		}

	}

}

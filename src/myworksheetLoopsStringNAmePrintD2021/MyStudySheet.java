package myworksheetLoopsStringNAmePrintD2021;

import java.util.Scanner;

public class MyStudySheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		System.out.println("enter numer:");
		int num =scan.nextInt();
		
		for (int i =1; i<=10; i++ ) {
			int result = num*i;
			System.out.println(num+ "x"+i +" = " +result);
		}
		
		
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter number: ");
		int numi=scan.nextInt();
		
		for (int x=0; x<5; x++) {
			int result = num*x;
			System.out.println("Result is: " + result );
		}
		
		
	}

}

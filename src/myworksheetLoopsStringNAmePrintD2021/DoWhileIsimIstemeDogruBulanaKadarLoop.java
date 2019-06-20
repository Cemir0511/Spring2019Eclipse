package myworksheetLoopsStringNAmePrintD2021;

import java.util.Scanner;

public class DoWhileIsimIstemeDogruBulanaKadarLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String names="";
		Scanner scan=new Scanner(System.in);
		do {
			
			System.out.println(names);
			System.out.println("Enter second");
			names=scan.next();
		}while(! (names.equals("Zeliha")));
		
		System.out.println("the end");
		
	}

}

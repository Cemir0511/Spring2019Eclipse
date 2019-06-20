package myworksheetLoopsStringNAmePrintD2021;

import java.util.Scanner;

public class PrintOurNameCharByCharDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner scan=new Scanner(System.in);
		String name="Hurma";//scan.next();
		
		int i =0; //karakter 0 dan baslayacak
		
		do {
			
			System.out.print(name.charAt(i)+ " "); //karakter sayisi/yeri,sifirdan baslayacak
			i++; //character sayisi kadar artacak, limit bu
			
		}while(i <name.length() );
		System.out.println();
		
		
		String aname= "Zeliha";
		int x= name.length();
		
		do {
			System.out.print(aname.charAt(x) +" ");
			x--;
			
		}while(x>=0);
		
		
	}

}

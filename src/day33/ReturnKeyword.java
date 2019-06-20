package day33;

import java.util.Scanner;

public class ReturnKeyword {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		
		if (num<0) { 
			// once return keyword is reached, method finish 
			
			return ; //void method icin de return kullanilir.
			         //ama bu rdaki amac, to get out of the method
			         //return value degil..
			       ///once return keyword reached, method finishes
			        //it says "return nothing"
			
			      // break sadece switch ve for loop icin kullanilir, 
			      // return methodlar icin kullanilir
			//So:
			 //1. return is used to get out of any method
			// 2. return can be used for any method,  for return type method
			      //it returns value
		}
		
		
		System.out.println("complex statement");
		System.out.println("complex statement");
		System.out.println("complex statement");
		System.out.println("complex statement");
		System.out.println("complex statement");
		
	}

}

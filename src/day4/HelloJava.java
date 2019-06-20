package day4;

import java.util.Scanner;

public class HelloJava {

	public static void main(String[] args) {
		
		
int n1,n2,n3; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three numbers");
		n1=input.nextInt();
		n2=input.nextInt();
		n3=input.nextInt();
		int Sum = n1+n2+n3;

		//System.out.println("Enter three numbers");
		System.out.println("Sum of three numbers are= " + Sum);

		//System.out.println("HELLO AGAIN");
	}

}

package day11;

import java.util.Scanner;

public class Task1Day11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s =new Scanner(System.in);
		
		int a;
		
		System.out.println("Enter your number");
		a=s.nextInt();
		
		if(a%5==0) {
			System.out.println("fizz");
			
		}else if(a%3==0) {
			System.out.println("buzz");

		}else if (a%5==0 & a%3==0){
			System.out.println("fizz buzz");
		}else {
			System.out.println("none of these");
			
		}
			
			
		}
		
	}



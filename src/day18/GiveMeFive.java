package day18;

import java.util.Scanner;

public class GiveMeFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		
		int x= 0;
		while(x!=5) {//loop will keep looping until ur condition become false..!!!
			          ///tam 5 girilene kadar keeps looping..5 gorunce durur.cunku 5 degil 
			System.out.println("Give me 5 ");
			x= scan.nextInt();
			
			
		}
		
		System.out.println("yay good job!");
		
		
		System.out.println();
		
		int a = 0;
		
		while (a!=3) {
			System.out.println("Give me 3");
			a = scan.nextInt();
		}
		System.out.println("Got 3 god job");
	}

}

package myworksheetLoopsStringNAmePrintD2021;

import java.util.Scanner;

public class DoWhileSumofAllThing {

	public static void main(String[] args) {
		
		
		
		
		Scanner scan =new Scanner(System.in);
		
		int i =0;
		int sum= 0;
		
		do {
			System.out.println(i);
			i++;
			sum=sum+i;
			System.out.println(sum);
			if(sum>40) {
				break;
			}
		}while(i<=10);

		System.out.println("i is: " + i + ", "+ "sum is : "+ sum);
		
		
		System.out.println();
		int sums=0;
		for(int x=0; x<=10;x++) {
		 sums= sums+x;
			System.out.println("x is: " + x + ", "+ "sums is all "+ sums);
		}
		
		
	}

}

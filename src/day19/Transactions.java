package day19;

import java.util.Scanner;

public class Transactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("What is your current balance?");
		double balance = scan.nextDouble();
		int count = 0;

		while(balance > 0) {
			count++;//increase transaction by 1
			System.out.println("What is transaction #"+count+" amount?");
			double transaction = scan.nextDouble();
			//balance = balance - transaction;
			if(transaction > balance) {
				System.out.println("You balance is about to be negative due to this transaction");
				//continue;//go on top of loop right away
			}
			balance -= transaction;
			System.out.println("Current balance: " + balance);
		}

		System.out.println("You have insufficient funds for any more transactions, your balance is " + balance);
		System.out.println("Transactions total count:" + count);
		
	}

}

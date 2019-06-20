package day8;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		/*
		 * if(/// put some boolean expression in here) {
		 * 	   do some action if its true 
		 * } else {
		 * 	 do something else if its false 
		 * }
		 *  // HackerRank , CodingBat , LeetCode and so on 
		 *	TASK 1 
		 *	IMPROVE THIS CODE WITH SCANNER 
		 *  ask user to enter the score 
		 *  then execute below conditional  program 
		 *
		 * */
		Scanner input = new Scanner(System.in); 
		System.out.println("What is your score ?");
		int score = input.nextInt() ; 
		
		System.out.println("current score is "+ score);

		if( score > 60 ){
			System.out.println("YOU SHALL PASS ! ");
		}else{ 
			System.out.println(" YOU SHALL NOT PASS! ");
		}

		

	}

}

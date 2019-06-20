package day20WHileDoWhileForLoops;

import java.util.Scanner;

public class NeighborsForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word");
		String word = scan.next();
		//aabcdd 
		//if character and next one are same print
		//Beeep - a
		//Beeep - d
					//aabcdd -i < 5
		for(int i = 0; i < word.length()-1; i++) {
			if(word.charAt(i) == word.charAt(i + 1)) {
				System.out.println("Beeep - " + word.charAt(i));
			}
		} 
		
	}

}

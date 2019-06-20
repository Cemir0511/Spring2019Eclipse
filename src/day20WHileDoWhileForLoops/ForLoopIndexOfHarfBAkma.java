package day20WHileDoWhileForLoops;

public class ForLoopIndexOfHarfBAkma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "Amazon";
		word = word.toLowerCase();
		char letter = 'z';
		int index = -1;

		//using for loop - look for the letter 
		//if it is a match assign value to index
		//exit for loop
		//print value of index
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == letter) {
				index = i;
	            break;//exit the loop
			}
		}

		System.out.println("Index: " + index);


		
	}

}

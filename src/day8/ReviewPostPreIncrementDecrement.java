package day8;

public class ReviewPostPreIncrementDecrement {

	public static void main(String[] args) {
	
		System.out.println("score++ " + score++ ) ;	
//		System.out.println("score " +  score  );
//		
//		System.out.println("++score " +  ++score );
//		
//		System.out.println("score-- " +  score--  );
//		System.out.println("score " +  score);
		
		int score = 10; 
		int result = score++ ; 
		System.out.println("result is " + result );
		// current value of score is 10 and ready to be updated to 11 when score shows up again
		// step 1 : score is now 11
		// step 2 : score is still 11 score++ --> ready to be 12 next time it shows up 
		// step 3 : score is now 12 . ++score 13
		score = score++ + ++score ;  // 11+13 = 24 
		System.out.println(score);
		

		
	}

}

package gunlukTekrarim;

public class chessBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //Sayyara practice
		 
		/*
		 * Given a 8x8 two-dimensional array of strings named chessboard. Initialize
		 * values inside an array accordingly to the chess board. So first element in
		 * the array, chessboard[0][0] should have a value "1a", and last element in the
		 * array, chessboard[7][7] should have a value "8h".
		 */
		String[][] chessBoard = new String[8][8];
		for (int i = 1; i < 9; i++) {
			System.out.println("I am outer loop and my value is" + i);
			int j = 0;
			for (char x = 'a', j1 = 0; x <= 'h'; x++, j++) {
				
				System.out.println("outer"+i+" inner  is" + x);
				
				chessBoard[i - 1][j] = "" + i + x;
				//System.out.print("" + i + x);

			}
			System.out.println();

		}
		// 
		 String[][] chessBoard1 ={{"1a","1b","1c","1d","1e","1f","1g","1h"},
		    		{"2a","2b","2c","2d","2e","2f","2g","2h"},
		    		{"3a","3b","3c","3d","3e","3f","3g","3h"},
		    		{"4a","4b","4c","4d","4e","4f","4g","4h"},
		    		{"5a","5b","5c","5d","5e","5f","5g","5h"},
		    		{"6a","6b","6c","6d","6e","6f","6g","6h"},
		    		{"7a","7b","7c","7d","7e","7f","7g","7h"},
		    		{"8a","8b","8c","8d","8e","8f","8g","8h"}};
 
 
		
	}

}

package day23;

public class TAbleCellLocation2 {

	public static void main(String[] args) {
		/*
	     * create a program to print out each location of cell in this format
	     * 
	     * table with 2 column and 2 row
	     * 
	     * cell (1,1) cell (1,2) cell (2,1) cell (2,2)
	     *
	     */

//	    System.out.print("Cell(" + 1 + "," + 1 + ") "    );
//	    System.out.print("Cell(" + 1 + "," + 2 + ") "    );
//	    System.out.print("Cell(" + 1 + "," + 3 + ") "    );
//	    System.out.print("Cell(" + 1 + "," + 4 + ") "    );
	//    
	    // given you have 3 row and 4 column

	    for (int row = 1; row <= 3; row++) {
	      //System.out.println("Row : " + i);
	      for (int col = 1; col <= 4; col++) {

	        System.out.print("Cell(" + row + "," + col + ") "    );

	      }
	      System.out.println();
	    }
	    
//	    for (int i = 1; i <= 3; i++) {
//	      System.out.println("Row : " + i);
//	      for (int x = 1; x <= 4; x++) {
	//
//	        System.out.print("Column : " + x + " ");
	//
//	      }
      System.out.println();
//	    }
	    
  for (int rows = 1; rows<=3;rows++) {
	for (int cols = 1 ; cols<=4; cols++) {
		System.out.print("Cells("+rows+","+ cols+")" );
	}
	System.out.println();
}
System.out.println();
  for (int sira = 1; sira<=3; sira++) {
	  for (int sutun = 1; sutun<=4; sutun++) {
		  System.out.print("sira("+sira+","+sutun+")");
	  }
	  System.out.println();
  }

	}

}

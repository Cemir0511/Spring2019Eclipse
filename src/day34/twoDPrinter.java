package day34;

import java.util.Arrays;

public class twoDPrinter {

	public static void main(String[] args) {
		

		// Task 2 : //betulunki:

		/*
		 * create a method called twoDPrinter 
		 * accept one 2D int array object as parameter 
		 * and print them all out in excel like row and column 
		 
		   create a method called get2DArray
		   accept 2 int as parameters , row, col
		   return 2D array object in below logic : 
		     
		   get2DArray(2,3) --->> { {1,2,3},{1,2,3} }
		 
		 
		 * */

		System.out.println(Arrays.deepToString(twoDPrinter(2,3)));
	
	
	}

	public static int [][] twoDPrinter (int row, int col) {
		
    int num [][]= new int[row][col];
		
		for(int i=0; i< row; i++) {
			for(int j=0; j<col ; j++) {
				num[i][j]=j;
			}
		}
		return num;
	}
		
	
}

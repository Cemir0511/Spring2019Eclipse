package day24;

import java.util.List;

public class Arrays {

	public static void main(String[] args) {
		// WARM UP TASKS
        /*
         * 1, print java 5 times in one row  java java java java java
         *         print total of 5 rows of above message
         * 2, print 1-5 in one line     
         *       print above line 5 more times  as we did in class
         *       NOW : modify this code to print
         *    1
         *    12
         *    123
         *    1234
         *    12345
         *  3, Print A-Z  26 times in 26 rows
         *    NOW :
         *     Modify the code to print as below
         *     A
         *     AB
         *     ABC
         *     ABCD
         *     ABCDE
         *     ...
         *     ...
         *     ALL THE WAY TILL Z
         * */
		
		//1.print java 5 times in one row  java java java java java
        // print total of 5 rows of above message
		
		String java= "java";
		
		for (int row=1; row<=5; row++ ) {
			
			for (int i=1; i<=5; i++ ) {
				System.out.print("java ");
			}
			System.out.println();
		}
		System.out.println();	
		
		/*2. 2, print 1-5 in one line     
         *       print above line 5 more times  as we did in class
         *       NOW : modify this code to print
         *    1
         *    12
         *    123
         *    1234
         *    12345  
		*/
			
			
			for (int row2=1; row2<=5; row2++) {
				for (int num=1; num<=row2; num++) {
					System.out.print(num+" ");
				}
				System.out.println();
		}
			System.out.println();
		/*3. Print A-Z  26 times in 26 rows
         *    NOW :
         *     Modify the code to print as below
         *     A
         *     AB
         *     ABC
         *     ABCD
         *     ABCDE
		 * 
		 */
		for (int i='A'; i<='Z'; i++) {
			for (int let='A'; let<=i; let++) {
				System.out.print((char)let+" ");
			}
			System.out.println();
		}

	}

	public static String toString(int[] nums) {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<Integer> asList(int i, int j, int k, int l, int m, int n, int o) {
		// TODO Auto-generated method stub
		return null;
	}

	


}

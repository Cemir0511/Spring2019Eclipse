package GitHubDay24;

import java.util.Random;
import java.util.Scanner;

import day24.Arrays;

public class Day24GutHubTumCodelar {

	public static void main(String[] args) {
		// WARM UP TASKS
        /*
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
////for (int i = 1; i <= 26; i++) {
////for (int i = 65; i <= 91; i++) {

	for (int i = 'A'; i <= 'Z'; i++) {

		for (int c = 'A'; c <= i; c++) {
			System.out.print( (char)c + " ");
		}
		System.out.println();
		
	}


//for (int c = 'A'; c <= 'A'; c++) {
//	System.out.print( (char)c + " ");
//}
//System.out.println();
//
//for (int c = 'A'; c <= 'B'; c++) {
//	System.out.print( (char)c + " ");
//}
//System.out.println();
//
//for (int c = 'A'; c <= 'C'; c++) {
//	System.out.print( (char)c + " ");
//}
//System.out.println();

	// WARM UP TASKS
			/*
			 * 2, print 1-5 in one line print above line 5 more times as we did in class NOW
			 * : modify this code to print 
			 * 1 
			 * 12 
			 * 123 
			 * 1234 
			 * 12345
			 */
			
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
			
			

			
			
			
//			for (int j = 1; j <= 1; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//			for (int j = 1; j <= 2; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//			for (int j = 1; j <= 3; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//			for (int j = 1; j <= 4; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//			for (int j = 1; j <= 5; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
			
			
			
//			for (int i = 1; i <= 5; i++) {
	//
//				for (int j = 1; j <= 5; j++) {
//					System.out.print(j + " ");
//				}
//				
//				System.out.println();
			
			// WARM UP TASKS
			/*
			 * 1, print java 5 times in one row java java java java java 
			 * print total of 5 rows of above message *
			 */
			for (int i = 1; i <= 5; i++) {
			
				for (int j = 1; j <= 5; j++) {
					System.out.print("java ");
				}
				System.out.println();
			}
			
			Scanner scan = new Scanner(System.in) ; 
			int[] arr = new int[3] ; 

			for (int i = 0; i < arr.length; i++) {
				
				System.out.println("enter number " + (i+1) );
				arr[i] = scan.nextInt();
				System.out.println( arr[i] );
			
			}
			
			
			// BAD WAY TO GET THE MAX 
			// INITIAL VALUE PREFERRABLY THE FIRST ITEM 
//			int max = 0 ; 
//			for (int i = 0; i < arr.length; i++) {
//				
//				if(arr[i]> max  ) {
//					max = arr[i] ; 
//				}
//				
//			}
//			System.out.println(max);
			
			int min = arr[0] ; 
			for (int i = 1; i < arr.length; i++) {
				
				if(arr[i]< min  ) {
					min = arr[i] ; 
				}
				
			}
			
			System.out.println("min value is : "+ min);
	 		
			Scanner scan1 = new Scanner(System.in) ; 
			int[] arr1 = new int[3] ; 
			
//			System.out.println("enter number");
//			arr[0] = scan.nextInt();
//			System.out.println("enter number");
//			arr[1] = scan.nextInt();
//			System.out.println("enter number");
//			arr[2] = scan.nextInt();
			
			
			for (int i = 0; i < arr1.length; i++) {
				
				System.out.println("enter number " + (i+1) );
				arr1[i] = scan1.nextInt();
				System.out.println( arr1[i] );
			
			}
			

			Random rand = new Random() ; 
			int[] nums = new int[10] ; 
			
			System.out.println( rand.nextInt(100) );
			System.out.println( rand.nextInt(100) );
			System.out.println( rand.nextInt(100) );
			System.out.println( rand.nextInt(100) );
			System.out.println( rand.nextInt(100) );
			
			
			
			for (int x = 0; x < 10; x++) {
			  // 0- 100-1
				nums[x] = rand.nextInt(100);
				
			}
			System.out.println(rand.toString());
			
			System.out.println( Arrays.toString(nums) );

	
			
			
			
			
			// print them out using the loop 
						// get the sum of all numbers 
						// get the max number 
						
				public static void main(String[] args) {
					
					int nums []= {1,4,6,8,9,5};
					
					int max = nums[0] ;
					
					
					for (int i = 1; i < nums.length; i++) {
						
						if( nums[i] > max ) {
							max =  nums[i] ; 
						}
						
					}
					/*// we assume the first item is the max 
					 * then compare the first item to the rest of them 
					 * and replace the value of max with actual max number
					 * in each iteration 
					 * max 1 
					 * iteration 1 ---> 4>1  ----> max 4
					 * iteration 2 ---> 6>4  ----> max 6
					 * iteration 3 ---> 8>6  ----> max 8
					 * iteration 4 ---> 9>8  ----> max 9
					 * iteration 5 ---> 5>9 false ----> max 9
					 * 
					 *  
					 * */
					
					System.out.println(max);

		
					// print them out using the loop 
					// get the sum of all numbers 
					// get the max number 
					
			//public static void main(String[] args) {
				
				int nums1 []= {1,4,6,8,9};
				
				int sum = 0 ; 
//				for (int i = 0; i < nums.length; i++) {
//					
//					sum = sum + nums[i] ; 
//					
//				}
//				int j = 0 ; 
//				do {
//					sum = sum + nums[j] ; 
//					j++ ; 
//				} while (j<nums.length);
//				
				int z = 0 ; 
				while (z<nums1.length) {
					sum = sum + nums1[z];
					z++ ; 
				}
				
				System.out.println(sum);
				
				
				
				
				// print them out using the loop 
				
				// OPTIONALLY SWAP the value of first and last items --> {9,.....,1}
				
				
				// get the sum of all numbers 
				// get the max number 
				
		public static void main(String[] args) {
			
			int nums []= {1,4,6,8,9};
			for (int i = 0; i < nums.length; i++) {
				System.out.print( nums[i] + " ");
			}
			System.out.println();
			
//			int temp = nums[nums.length-1]; 
//			nums[nums.length-1] = nums[0] ; 
//			nums[0] = temp ; 
			
			int temp = nums[4]; 
			nums[4] = nums[0] ; 
			nums[0] = temp ; 
			

			for (int i = 0; i < nums.length; i++) {
				System.out.print( nums[i] + " ");
			}
				

	}

}

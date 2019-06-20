package day30;

import java.util.Arrays;

public class day30MyPrepMuro {

	public static void main(String[] args) {
		
		
		////free practice:
		String [] fruits  = {"apple", "orange","banana", "avacado"};
		
	//for loop:
		for (int i=0; i<fruits.length;i++) {
			if (fruits[0].contains("apple")) {
				System.out.println("apple var");
				break;
			}else {
				System.out.println("apple yok");
			break;	
			}
		}
		
		//use for each loop to print fruits
		
		for (String fruit:fruits) {
			//System.out.print(Arrays.deepToString(fruits));
			System.out.println(fruit);
		}
		
    Arrays.sort(fruits);
    System.out.println(Arrays.deepToString(fruits));
	}

}

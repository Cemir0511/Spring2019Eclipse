package day42;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEach {

	public static void main(String[] args) {
	
		ArrayList <Integer> list4 = new ArrayList <Integer>(Arrays.asList(10,2,33,24,15));
		
		int i=0;
		int j = i;
		j = 100;
		
		System.out.println(i);
		
		
		///     for each loop, enhanced for loop:
		
		for(Integer each : list4) {               // iterating over arraylist by for each loop
			System.out.println("Item : " + each);
		}
		
		
		// for loop
		for (int x=0; x< list4.size(); x++){
			 //copying the value of item
			Integer each = list4.get(x);
			// changing the value of copy not original
			each = 100;
			//System.out.println("Item:" + each);
		}
		
		System.out.println(list4);
		System.out.println();
		
		
		// yukardaki iki loop code u da doing exactly same thing
		
		
		// for (int j2=0;j2<list4.size(); x++) {
		//	   System.out.println();
		// }
		

	}

}

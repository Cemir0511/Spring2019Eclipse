package day33;

import java.util.Arrays;

public class ReturningMultipleValue {

	public static void main(String[] args) {
	
		//int array olarak store edersin, cunku array type 
	 int [] myArray = giveMeAnArray();
	 
	 System.out.println(Arrays.toString(myArray));  // [1,2,3] printed
	
	 //yada direk tek shotta yapabilirdin:
	 // CALLING in one shot:
	 System.out.println(Arrays.toString(giveMeAnArray() ) );
	 
	 
		
	}
	
	

	// multiple return value icin int array kullaniriz !!!
	// normalde sadece int value kullanirdik, ama pek cok data type icin int [] kullaniriiz:
	
	// ** this method have no parameter
	//    and return int array object/s as returned value
	public static int []  giveMeAnArray () {
		
		System.out.println("Action");
		int[] arr = new int [] {1,2,3};
		
		//return Array.toString(arr);//niye bunu yazamayiz?
		//cunku int method, strimg olsa olurdu..dene
		                     
		return arr;
	}
	
	
}

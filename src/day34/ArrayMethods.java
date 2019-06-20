package day34;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
	
		
		
		
		int x=15;
		int [] resultArr= getArrayFrom1toX(x);
		System.out.println(Arrays.toString(resultArr));
		
		
		//turn this result into String outside
		//getArrayFrom1toX(7);
		String arrInString= Arrays.toString(getArrayFrom1toX(7));
		System.out.println(arrInString);
		
		System.out.println( Arrays.toString(getArrayFrom1toX(17)) );
		
		//(Array.toString olmazsa hascode verir, cunku array leri Arrays.toString le print edersin
		getArrayFrom1toX(10);
		
			
		
		//System.out.println(Arrays.toString(arr));
	
	}
	

	
	public static int [] getArrayFrom1toX (int x) { //int array is object
int [] arr = new int [x]; //x adet, size yani
		
		for (int i=0; i<arr.length;i++) {
			arr[i]= i+1; // 1. almak icin 0+1..yani i+1 yaptik
		//Sout )i+1);	
		}
		return arr;
		
		
		}
	

	/*
	 * 
	 *  /*
     * Create static a method called
     *  
     *  getArrayFrom1toX
     *  it takes one parameter 
     *  and return array starting from 1 to the number specified
     *  
     *   getArrayFrom1toX(5) --> {1,2,3,4,5}
     * */
   /*
    *  int x = 15 ; 
  
    int[] resultArr = getArrayFrom1toX(x) ; 
    System.out.println(Arrays.toString(resultArr));

    /// turn this result into String outside 
    String arrInString = Arrays.toString( getArrayFrom1toX(7) ); 
    System.out.println(arrInString);
    
    System.out.println( Arrays.toString(getArrayFrom1toX(17)) );
    
    
    
    //System.out.println(Arrays.toString(arr));

  }
  
  public static int[] getArrayFrom1toX(int x) {
    
    int[] arr = new int[x];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i+1 ; 
      //System.out.println( i+1  );
    }
    
    return arr ; 
  }
  

  
  
  
  
  

}
	 * 
	 * 
	 * 
	 */
}

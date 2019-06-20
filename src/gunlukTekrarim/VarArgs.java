package gunlukTekrarim;

import day31.Calculator;

public class VarArgs {

	public static void main(String[] args) {
		/*
		Calculator c = new Calculator();
	      int nums = {2,3,77};
	      c.printAllArrayNumbers(nums);
	      c.printAllNumbers(1,2,3,54,23432,423,23432) //: call ettik
	      
	      c.printAllNumbers(3,4,6,7); // baska sayilarla da call edebiliriz
	 */    
	}

	 public void printAllArraynumbers(int [] numbers){
	      
	      
	     // for(int =0; i<numbers.length;i++){    //for loopla array leri print etmek istiyorum
	      //System.out.print(numbers[i] + " ");   // index i ile okuyorum, numbers[i] yani
	      
	      //}
	      //System.out.println();
	      
	      //instead of printing array, I want to print a variable number of arguments:
	 }   
	       
	public void printAllNumbers (int... numbers){ 
	                                      // array yerine vararg kullandik
	                                      // you can pass as many arguments as u want as long as the type is int
	      // System.out.println (numbers[i] + " ");
	       }
	       
	      

}
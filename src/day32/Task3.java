package day32;

public class Task3 {

	public static void main(String[] args) {
		
		
		//return a value olanlarda yani non-void lerde, ya assign ediyorsun bir value yu methoda
		//yada direk sout icinde method ismiyle parametreyle print ettirebilirsin
		//ama mutlaka main methodda print ettireceksin ki action alacak
		int biggerNum= giveMeBiggerNumber(10, 15);
		System.out.println(biggerNum);
		
		System.out.println(giveMeBiggerNumber(100 , 11));
		
		

	}
	
	public static int giveMeBiggerNumber (int a, int b) {
		 if (a>b) {
			 return a;
		 }else {
		     return b;
		
		//ternary --->>  int bigger = (a>b) ? a : b;
		//return bigger
		     
		  //TERNARY baska sekli:   
		// int max = (a>b)? a:b;
		// return max;
	}

	///TASK 3 :
	  
	  // CREATE static method called giveMeBiggerNumber
	  // it takes 2 int as parameter 
	  // and return bigger number 
	  
	  // call the method couple times with different result 
	
	}
}
   
package day27;

public class WarmUp {

	public static void main(String[] args) {
		/*
		//Task1 : 
	create an array of int with 5 items , return true if all items are more than 10
	return false if not
	*/
	
	  boolean result = true ; 
    
    for (int i = 0; i < num.length; i++) {
      
      if(num[i]<=10) {
        result = false ; 
        break;
      }
    }
//      if(num[i]>10) {
//        System.out.println("true");
//      }else {
//        System.out.println("false");
//      }
      
    
    System.out.println( result );


/*//Task 2 :
given : 
String str = "Cybertek Batch Spartan is most hardworking Batch ever";

use the method your learned to get each words
and store it into String array: 

loop through each items -- 
  in each iteratrion loop : 
  	 turn each word into char array 
  	 print each char out with seperated by -
output : 
	C-y-b-e-r-t-e-k-
	B-a-t-c-h-
	S-p-a-r-t-a-n-
	i-s-
	m-o-s-t-
	h-a-r-d-w-o-r-k-i-n-g-
	h-c-t-a-B
	e-v-e-r-

// Optional : Reverse each word in sentence
your output should be 
ketrebyC hctaB natrapS si tsom gnikrowdrah hctaB reve 
Collapse
	*/
		

}
}

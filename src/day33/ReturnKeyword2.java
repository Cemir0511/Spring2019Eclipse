package day33;

public class ReturnKeyword2 {

	//    break   vs   return:
	/*
	 * break ---> we can only use it inside switch and loop
	 * 
	 * return  ---> 
	 */
	
	
	
	public static void main(String[] args) {
		
	ageTester (16); //not qadult
	ageTester(36);  // go to work ... yani got out of the method
	
	
	
	System.out.println(isAdultOrNot(16));
	System.out.println(isAdultOrNot(26));
	
	
	}
	
	
  /////////////
	
   public static boolean isAdultOrNot(int age) {
	if (age< 18) {
		System.out.println("not adult");
		return false ; //bu false olunca if ten cikmak icin olan return
	}                   //bunun yerine else de olabilir tabi
	   
	return true ; // bu non-void(return type) oldugu icin yazilmak zorunda olan return
}
	
   
   /////////////
	public static void ageTester (int age) {
		// this is a void method, that doesn't return value, but we used return to get out of the method 
		
		if (age<18) {
			System.out.println("Not adult");
			return; // we are using return keywrd to get out of the method
		            //once the return keyowrd is reached, it will exit the method
			
		
		}           
		System.out.println("Go to work");
		System.out.println("Get paid");
		System.out.println("Study java");
		
	}
	
	
	
	// ... looptan early cikmak istersen return koyarsin
	
	 /// BREAK VS RETURN 
	  /*
	   * break : ---> we can only use it inside switch and loop
	   * 
	   * return : --> exclusively used to return a value
	   *       or terminate method execution  
	   * */
	  
	  
	  public static void main(String[] args) {
	    
	    //ageTester(16);
	    //ageTester(36);
	    
	    System.out.println( isAdultOrNot(16)   );
	    System.out.println( isAdultOrNot(26)   );
	    
	  }
	  // a method that return a value of any type 
	  // should not have any chance to not return value 
	  // or it will not even compile 
	  
	  // you may have many return statement in different execution path 
	  // buy you may only return one value 
	  
	  /**/
	  
	  
	  
	  
	  
	  
	  public static boolean isAdultOrNot(int age) {
	    
	    if(age< 18) {
	      System.out.println("not adult");
	      return false;  
	    }else {
	    
	      return true ; 
	    }
	    
	  }
	  
	  
	  
	  public static void ageTester(int age) {
	    
	    if(age< 18) {
	      System.out.println("not adult");
	      return ;  // once the return keyword is reached 
	            // it will exit the method 
	    }
	    
	    System.out.println(" go to work");
	    System.out.println(" get paid ");
	    System.out.println(" pay your bill");
	    
	  }
	  
	  

	}


}


package day21LoopsPractice;

public class CountingACharIntForLoop {

	public static void main(String[] args) {
		
		String str="AAccBBBdEEEf";
		//get unique character out of above character
		
		String newStr= "";
		
		//store first char into newStr
		//store the next char into newStr if its' not already there
	for (int i = 0;i<str.length();i++) {
		System.out.println(str.charAt(i));
		
		//contain method only gets a string, 
		//to make it a string u add ""
		//for ex: (! newStr.contains( str.charAt(1)+""  ))
		
//	    newStr = newStr + str.charAt(0); 
	   
//	    if(! newStr.contains( str.charAt(1)+""  )) {
//	      newStr = newStr + str.charAt(1); 
//	    }
	    System.out.println(str);
	    for (int i1 = 0; i1 < str.length(); i1++) {
	    
	      String eachChar = str.charAt(i1)+"" ; 
	      
	      if( newStr.contains( eachChar  )) {
	        System.out.println(eachChar + " duplicate");
	      }else {
	        newStr = newStr + eachChar ; 
	      }
	      
	    }
	    
	    System.out.println(newStr);
		
	}

	}

}

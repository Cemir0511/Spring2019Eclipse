package day15;

public class SearchForJavaVerifySearchResults2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//About 813,000,000 results (0.56 seconds) 
		// store above String and validate 
		// it starts with word About , and it contains word result
		
		
		String str = "About 813,000,000 result (0.56 seconds)" ; 
		
		// how to get certain part of String 
		
		//if( str.indexOf("About")==0 ) {  // About un index i 0 mi..evet
		
		if( str.substring(0,5).equals("About") && str.contains("result") ) {
			                                                 //results yazsak , it doesnt contai
			System.out.println("it pass");
		}else {
			System.out.println("it fails");
			
			/*
			if(  ! str.substring(0,5).equals("About") ) {
				System.out.println("about did not start in the beginning");
			}else if(! str.contains("results")) {
				System.out.println("does not contains word results");
			}
			
			System.out.println("it fails");
		
*/
		
		
		}}

}

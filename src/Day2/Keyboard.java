package Day2;

public class Keyboard {

	public static void main(String[] args) {
		
		
	//   / What is JVM ?
			//System.out.println(" What is JVM ?" );
			System.out.println(" What is JRE ?" );
			System.out.println(" What is JDK ?" );
			
			/*
			 in order to just run java application what do we need ? 
			 JRE --
			 in order to just develop java application what do we need ? 
			 JDK 
			 JDK has JRE , JRE has JVM 
			*/
			
			
			/*
			 *  Variable : a container or storage to store piece of data with certain type
			 	
			 	declaring a variable  :  dataType variableName ; 
			 	
			 */
			int count ;  // declaring variable 
			count = 10 ; // assignment , literal value 
			
			
			int x, y , z ; 
			x = 10 ; 
			y = 20 ; 
			z = x + y ; 
			
			// once you use one variable name , you can not reuse that variable 
			// in same block 
			int score = 100 ;  // declaring and assigning in one statement 
			score = 200 ;  // reasssignment 
			
			System.out.println(  z  );
			System.out.println(score);
			
			
			/*
			 * Naming variable 
			 *  	  is this a valid name for a variable 
			 *  	  int abc ;  ---good 
			 *  	  int 123 ; ----bad 
			 *    int a123; --- good
			 *    int _a ;  --- good
			 *    int $  ;  ----good -- not recommended
			 *    int a-b ; ---- bad 
			 *    int _123 ; ---good -- not recommended
			 * 
			 *  Rules: 
			 *  	   57 Reserved keywords should be avoided : System public class 
			 * 	   you can use leters a-z  A-Z 
			 * 	   numbers , (just dont start with number)
			 * 	   only 2 special character _ $
			 * 	   
			 * 	Guideline :
			 * 		for more than one word , use camel case   int gameScore  ; 
			 *      make your variable name tell what do you wanna store
			 *      int countOfOnlineStudent = 300 
			 * 
			 * 	   PLEASE COME BACK AT 12:10 
			 * 
			 *   Naming a class rule: 
			 *   	Reserved keywords should be always avoided
			 *   	It should be whole word without space 
			 *     
			 *   Guideline : 
			 *   	It should always start with Uppercase , the rest can be lower case
			 *      if you have muliple word , it can be camelCase
			 *      Car , Boat , ComputerMonotor 
			 *      
			 *   package naming 
			 *   	 Reserved keywords should be always avoided
			 *   	It should be whole word without space 
			 *   
			 *   	name is alwayse encourange to be lowercase 
			 *   
			 *   */
	}

}

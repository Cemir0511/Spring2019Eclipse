package day14;

public class MoreStringMethods {

	public static void main(String[] args) {
		
		
		
		// substring(beginningIndex, EndingIndex)
				// beginning index is always inclusive 
				// ending index is always exclusive 
		
		            //012345  
		String name= "Merzet";
		
		System.out.println((name.substring(2,5))); 
		
		
		System.out.println(name.substring(0,3));
		
		
		System.out.println(name.substring(1,6));
		
		System.out.println(name.substring(3,6));
		
		
		// subString(beginningIndex, EndingIndex)
				// beginning index is always inclusive 
				// ending index is always exclusive 
				
						
				
				
				// rze
				System.out.println(  name.substring(2,5)   );
				
				//System.out.println(  name.substring(5,1)   );
				//System.out.println(  name.substring(5,1)   );
				System.out.println(  name.substring(1,6)   );
				
				// Task 1
				
				// store your name into A String 
				// print your last character 
				// print your first 2 character 
				
				// OPTIONAL 
				// print your name starting from middle till the end
							  //0123456
				String name2 = "Dilyara" ; 
				int count = name2.length() ; 
				
				System.out.println(  name2.substring(count-1, count)     );
				
				System.out.println(  name2.substring(0, 2)     );
				
				int midPoint = count/2 ; 
				System.out.println(midPoint);
				
				System.out.println( name2.substring(midPoint,count) );
				
				
				
				
				
				
				
			}

		
		
		
	
	

}
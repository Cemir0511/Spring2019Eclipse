package day23;

public class Reverse {

	public static void main(String[] args) {
		//Task tan: 1, write a program to reverse a string
		
		  //012345
	    String str = "Goksel" ; 
	    String reversed = "" ; 
	    
	    for (int i = str.length()-1 ; i>=0  ; i--) {
	    
	      reversed += str.substring(i,i+1) ; 
	      //System.out.print( str.substring(i,i+1)   );
	    
	    }
	    System.out.println(reversed);
	    
//	    reversed += str.substring(0,0+1) ; 
//	    reversed += str.substring(1,1+1) ; 
//	    reversed += str.substring(2,2+1) ; 
//	    reversed += str.substring(3,3+1) ; 
//	    reversed += str.substring(4,4+1) ; 
	    
	   
	    
	    String name= "ZelihaKemal";
	    //String myreversed ="";
	    
	    for (int x=name.length()-1; x>=0; x--) {
	    	//myreversed+= name.substring(x,x+1);
	    	System.out.print(name.substring(x,x+1));
	    }
	    System.out.println();
	    
	    String names= "Ahmet";
	    String reverseds="";
	    for (int k = names.length()-1; k >=0; k-- ) {
	    	
	    	//reverseds+= names.substring(k,k+1);
	    	System.out.print(names.substring(k,k+1));
	    	
	    }
	    //System.out.println(reverseds); 
	    
	    
	    
		
	}

}

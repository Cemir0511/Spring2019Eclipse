package day21LoopsPractice;
public class StringAndLoop {
	public static void main(String[] args) {
		// EVERY FOR LOOP CAN BE WRITTEN IN WHILE LOOP

	    // use for loop to print your name char by char
	    // and print reverse order char by char

	    // OPTIONALLY Save it into another variable
	          // 012345
	    String name = "Dilnur";
	    String myname="zeliha";
	     for (int z=0; z<myname.length();z++) {
	    	System.out.print(myname.charAt(z)); 
	     }
	     System.out.println(); 
	    for (int z= myname.length()-1; z>=0; z--)	
	    	System.out.print(myname.charAt(z));
	    System.out.println();
	     
	    String newmyname= "";
	    for(int n= 0; n<myname.length(); n++) {
	    	System.out.print(myname.charAt(n));
	    	char eachChar= myname.charAt(n); //eachChar i assign et yazdirmayi
	    	newmyname= newmyname + eachChar; //baglantiyi kur, 
	    	                                 //yeni variable a assigne et +eachChar ile
	    }
	    //System.out.println(newmyname);
	    System.out.println();
	    int p=0;
	    char ch = myname.charAt(p);
	    System.out.println(myname.charAt(ch).toUpperCase() +myname.substring(1));
	// TASK 3.1
//	    for (int d = 0; d < name.length(); d++) {
//	      System.out.print(name.charAt(d) + " ");
//	    }
//	    System.out.println();
//	    // TASK 3.1
//	    for (int d = name.length() - 1; d >=0 ; d-- ) {
//	      System.out.print(name.charAt(d) + " ");
//	    } 
	    // TASK 3.3
	    String newStr = "" ; 
	    for (int d = name.length() - 1; d >=0 ; d-- ) {
	      //System.out.print(name.charAt(d) + " ");
	      char eachChar = name.charAt(d); 
	      newStr = newStr + eachChar ;
	    }
	    System.out.println(newStr);
	    
	    
//	    int x = 0 ; 
//	    System.out.print(name.charAt(x) + " ");
//	    x++ ; 
//	    System.out.print(name.charAt(x) + " ");
//	    x++ ; 
//	    System.out.print(name.charAt(x) + " ");
//	    x++ ; 
//	    System.out.print(name.charAt(x) + " ");
//	    x++ ; 
//	    System.out.print(name.charAt(x) + " ");
//	    x++ ; 
//	    System.out.print(name.charAt(x) + " ");
//	    x++ ; 
	    
	    
//	    int x = name.length()-1 ; 
//	    System.out.print(name.charAt(x) + " ");
//	    x-- ; 
//	    System.out.print(name.charAt(x) + " ");
//	    x-- ; 
//	    System.out.print(name.charAt(x) + " ");
//	    x-- ; 
//	    System.out.print(name.charAt(x) + " ");
//	    x-- ; 
//	    System.out.print(name.charAt(x) + " ");
//	    x-- ; 
//	    System.out.print(name.charAt(x) + " ");
//	    x-- ; 
	    

	    String newStr1 = "" ; 
	    int x = name.length()-1 ; 
	    newStr1 = newStr1 + name.charAt(x) ; 
	    System.out.print(newStr1 + " ");
	    x-- ; 
	    newStr1 = newStr1 + name.charAt(x) ; 
	    
	    System.out.print(newStr1 + " ");
	    x-- ; 
	    newStr1 = newStr1 + name.charAt(x) ; 
	    System.out.print(newStr1 + " ");
	    x-- ; 
	    newStr1 = newStr1 + name.charAt(x) ; 
	    System.out.print(newStr1 + " ");
	    x-- ;
	    newStr1 = newStr1 + name.charAt(x) ; 
	    System.out.print(newStr1 + " ");
	    x-- ;
	    newStr1 = newStr1 + name.charAt(x) ; 
	    System.out.print(newStr1 + " ");
	    x-- ; 
	    
	    //printed:
	    //runliD
	    //r ru run runl runli runliD 
	}

}

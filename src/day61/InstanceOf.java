package day61;

import day58.*;

public class InstanceOf {

	public static void main(String[] args) {
		
		Animal a1 = getMyAnimal() ; 
//	    String objTypeName = a1.getClass().getSimpleName() ; 
//	    System.out.println(  objTypeName );
	    
	    // instanceof operator is for checking 
	    // your object type IS-A the type you specified 
	    
	    // Cat c1 = (Cat) a1 ; 
	    boolean isDog =    a1 instanceof Dog  ; 
	    System.out.println("  is a1 pointing to a type of Dog : " + isDog);
	    
	    boolean isCat =    a1 instanceof Cat  ; 
	    System.out.println("  is a1 pointing to a type of Cat : " + isCat);
	    
	    if(isCat==true) {    
	      Cat c1 =  (Cat) a1 ;
	      System.out.println(c1.legsCount);
	    
	    }else if( isDog == true) {
	      
	      Dog d1 = (Dog) a1 ; 
	      System.out.println(d1.legsCount);
	    }
	    
	    
	    // if the object type of ref variable a1 pointing to IS-A the type you are checking using instance of keyword
	    boolean isAnimal =    a1 instanceof Animal  ;   // ObjectType Dog IS-A Animal or not 
	    System.out.println("  is a1 pointing to a type of Animal : " + isAnimal);
	  
	    
	    boolean isObject =    a1 instanceof Object  ;   // ObjectType Dog IS-A Object or not 
	    System.out.println("  is a1 pointing to a type of Object : " + isObject);
	  
	    
	    // CAN NOT USE INSTANCE OF KEYWORD FOR UNRELATED TYPES !!! 
	    //boolean isShape=    a1 instanceof Shape  ;   // ObjectType Dog IS-A Shape or not
	    
	    
	    
	    

	  }

	  /*
	   * create a static method that return Animal
	   * and return valid animal sub class object  
	   * */
	  public static Animal getMyAnimal() {
	    return new Dog(); // new Cat() ; 
	  }
	  
	  
	  
	  
	  

	

	  
	  

	
	
		
	
}

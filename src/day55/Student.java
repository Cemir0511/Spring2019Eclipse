package day55;

//abstract class are not meant to be instantiated 
//abstract class are meant to be a super class 
//to provide a general idea, without providing implemetation details 
// using abstract method 

//OTHER THAN ABOVE 
//YOU CAN HAVE EVERYTHING ELSE A NORMAL CLASS CAN HAVE 

public abstract class Student {
	 int id; 
	  String name; 
	  public static final String SCHOOL = "Cybertek"; 

	  public Student(int id, String name) {
	    this.id = id;
	    this.name = name;
	  }
	  public void study() {
	    System.out.println("Study hard to get the job");
	  }
	  public static void showSchool() {
	    System.out.println(SCHOOL);
	  } 


public abstract void attendClass() ; 

//public void attendClass() {
//  
//  System.out.println("IMPLEMENT IN SUB CLASSES");
//  
//}

}

/**  
 * ==^_^==>Common action is the abstract class.
 * --> from LocalStudent and OnlineStudent class
 * --> Abstract attendClass can be extracted. 
 * --> Abstract focus on essential, first
 * 
 * ==^_^==> public abstract class Student{   }
 * --> cannot be instantiated==> cannot create object out of it
 * --> some classes are not to be extended like final class
 * --> some classes are meant to be extended. Abstract is super class.
 * 
 * ==^_^==>public abstract void attendClass();
 * --> abstract keyword is used to create abstract method
 * --> abstract method does not have a body--> {   }
 * --> abstract has only a signature
 * 
 * 	 * ==^_^==> Why we cannot create object?
 * --> cannot make object from abstract class
 * --> Student s2 = new Student();
 * --> in abstract class you can have a body just to define
 * --> 
 * 
 * 
 * 	 * ==^_^==> three main rules
 * --> cannot be instantiated
 * --> are super clasess
 * --> use abstract class without providing implementation
 * 
 * 	 * ==^_^==> why use abstract class?
 * --> goal to provide reusable variables and methods to subclasses
 * --> also abstract is used to hide implementation from the user 
 * --> note that implementation is located in sub classes
 * 
 * 
 * 	 * ==^_^==> where can we use Abstract keyword?
 * --> in class
 * --> in method
 * -->
 * 
 * 
 * 	 * ==^_^==> what implement / provide body to abstract class?
 * --> a sub class
 * -->  
 * -->
 * 
 * 	 * ==^_^==> does abstract class have to have a method?
 * --> it's not required but message is the natural reason 
 *  --> why you have abstract
 * -->  
 * -->
 * 
 * 	 * ==^_^==> What can we have in an abstract a class
 * --> static method
 * --> instance method
 * --> constructor
 * 
 * * ==^_^==> two key between abstract and other method
 * --> no object created, meant for super class, no body {}
 * --> abstact method can be defined on;y in abstract class
 * -->  public abstract void attendClass(); method decleration
 * -->
 * 
 * * ==^_^==>
 * --> 
 * -->  
 * -->
 * 
 * * ==^_^==>
 * --> 
 * -->  
 * -->
 * 
 * * ==^_^==>
 * --> 
 * -->  
 * -->
 * 
 * * ==^_^==>
 * --> 
 * -->  
 * -->
 * 
 * * ==^_^==>
 * --> 
 * -->  
 * -->
 * 
 * * ==^_^==>
 * --> 
 * -->  
 * -->
 * */



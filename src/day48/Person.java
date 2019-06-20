package day48;

public class Person {

	public String name;
	public int age;
	public float  height;
	public char gender;

	
    public void eat() {
    	System.out.println("eating");
    }
}

/*
WARM UP TASK 

Create a Person class
	instance fields 
			name , age , height , gender
	create static field counter
	increase counter whenever new object gets created 



Create a Student class
	instance fields 
			name , age , height , gender , studentId

	create static field counter
	increase counter whenever new object gets created 
	  
	  create constructor to set all values
	  toString() method.

We will create a class Action to test our custom classes.
*/
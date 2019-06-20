package day47;

import java.util.ArrayList;

public class StudentUtility {

	// create a private static filed called studentList as ArrayList of String
	private static ArrayList<String> studentList;
	
	// create a static block to print out welcome to StudentUtitlity
	static {
		System.out.println("Welcome to StudnetsUtility");
	
	}
	// create another static block 
    // initialize your arrayList object
    // add 10 students

	static {
		
		loadAllMyData();
		
		
		System.out.println("ALL STUDNETS AHS BEEN LOADED");	
		
		
	}
	
	
	
	public static void main (String[] args) {
		
	//StudentUtility.dispalyAllStudent();
	displayAllStudent();
	
	System.out.println("---------");
	addOneStudent("Tugba");
	addOneStudent("Sheroz");
	
	displayAllStudent();
	System.out.println("----------");
	updateStudent(11, "Sgeroz Zoidov");
	displayAllStudent();
	
	removeStudent(6);  // Erdem gitti
	displayAllStudent();
	
	System.out.println("----------");
	resetTheList();
	displayAllStudent();
	
	}
	
	// create a static method called displayAllStudent , accept no param return nothing
		
	public static void displayAllStudent() {
		
		//System.out.println(studentList);
		
		for (int i = 0; i<studentList.size(); i++) {
			System.out.println( "No : " + (i+1)  + "-> " +  studentList.get(i) );
		
		}	
	}
	
	
	
	
	// create a static method called addStudent, 
	       //accept one parameter as String name
	      // and add that name to the List , return no value
	
	public static void addOneStudent(String name) {
		
		studentList.add(name);
	}
	
	// create a static method called updateStudent
	        // accept 2 parameters index as int, newName as String
	        // and it will update the name of student as that location
	public static void updateStudent (int index, String newName) {
		
		if (index>= studentList.size()) {
			System.out.println("OUT OF RANGE");
			// break; olmaz yani cunku// we use it in the loop or switch , break i baska yerde kullanmiyoruz
		    //continue; olur anca if clause da yada return
		    return; // return will get u out of method
		            //how do i use return keyword in void?  
		            // just gets out of the method, doesn't return anything cause void
		}
		studentList.set(index,newName);
	}
	
	
	//create a static method called removeStudent
	        // accept 1 params index as int
	        // and it will remove the name of student at that location
	
	public static void removeStudent(int index ) {
		if(index >=studentList.size()) {
			System.out.println("OUT OF RANGE");
		      return ; 
		    }
		    studentList.remove(index); 	
		
		
		
		
	}
	
	// create a static method called resetTheList
	        // accept no param and delete everything in the list
	
	public static void resetTheList() {
	    studentList.clear();
	}
	    
	    
	 // create a method to pre-populate 10 student into the list 
	   
	    private static void loadAllMyData() {
	      
	      studentList = new ArrayList<String>();
	      studentList.add("Abdul Kahn");
	      studentList.add("Nurilla");
	      studentList.add("Odiljan");
	      studentList.add("Ansar");
	      studentList.add("Muhammad");
	      studentList.add("Ali");
	      studentList.add("Erdem");
	      studentList.add("Muratbek");
	      studentList.add("Marat");
	      studentList.add("Kubanych");
	    
	    
	    }
}

package day42;

import java.util.ArrayList;

public class EmployeeAction {

	public static void main(String[] args) {
		
	// bunu incele, 1. eploye yi bulma,
		//en cok salary alani bulma, ismi a ile baslayani nulma falan hepsi 
		//bu yontemle olur , classta arralylist..
		//onjectleri arraylist de store ettik, array de olabilirdi
		
		Employee e1 = new Employee();
		//e1.printAllInfo();
       
		e1.age=39;
		e1. name = "Muzo";
		e1. title = "SM";
		e1.salary=10.000;
		
		
		Employee e2 = new Employee();
		e2.age = 18;
		e2.name= "lili";
		e2.title = "PO";
		e2.salary = 103.00;
		
		
		Employee e3 = new Employee();
		e3.age = 18;
		e3.name= "loll";
		e3.title = "PO";
		e3.salary = 103.00;
		e3.printAllInfo();
		
		
		Employee e4 = new Employee();
		e4.age = 18;
		e4.name= "boll";
		e4.title = "PO";
		e4.salary = 103.00;
		e4.printAllInfo();
		
		ArrayList<String> names = new ArrayList<>();
		
//****	// we have 4 object, we store them in arraylist of object
		
		ArrayList <Employee>myPeople = new ArrayList<>();
		myPeople.add(e1);
		myPeople.add(e2);
		myPeople.add(e3);
		myPeople.add(e4);
        myPeople.add(new Employee());
        
        for (int i=0; i< myPeople.size(); i++){
        	
        	//store each item -- employee object
        	Employee each = myPeople.get(i);
        	//calling method using this variable
        	each.printAllInfo();
        	
        	
        	myPeople.get(i).printAllInfo();
        	
        	
        	
        	
        } //ImprotanT TASK:
        
        // print out employee that make more than 100K , 
        // count employee that younger than 30
        // Save the name of all employee
        //who is more than 25 into a string variable names
        
        
        for (int i = 0; i < myPeople.size(); i++) {
            if(myPeople.get(i).salary>100000) {
                myPeople.get(i).printAllInfo();
            }
        }
        
        
        int count = 0;
        String rev ="";
        for (int i = 0 ; i<myPeople.size(); i++) {
        	if (myPeople.get(i).salary>=100000) {
        		myPeople.get(i).printAllInfo();
        	}
        }
        
        
        // yada one shot da:
        int count = 0;
		String var = "";
		
		for(int i = 0; i < myPeople.size(); i++) {
			Employee each = myPeople.get(i);
			if(each.salary > 100000) {
				each.printAllInfo();
			}
			if(each.age < 30) {
				count++;
			}
			if(each.age > 25) {
				var+=each.name;

			}
		}
		System.out.println("Amount of Employees under 30 " + count);
		System.out.println("Above 25 Employees: " + var + " ");

        
        /// yada baska;
		int count=0;
	    for (int i = 0; i < myPeople.size(); i++) {
			if(myPeople.get(i).salary>100000) {
				myPeople.get(i).printAllInfo();
			if(myPeople.get(i).age<30) {
				count++;
			}
			}
		}
        
        
        System.out.println(myPeople.size());
        
       // System.out.println(myPeople.get(0));
        
        Employee firstItem = myPeople.get(0);
        firstItem.printAllInfo();
        
        Employee secondItem = myPeople.get(1);
        secondItem.printAllInfo();
        
        Employee thirdItem = myPeople.get(2);
        thirdItem.printAllInfo();
        
        Employee forthItem = myPeople.get(3);
        forthItem.printAllInfo();
       
        Employee fifthItem = myPeople.get(4);    /// null cikti cunku 5. employee value yi assign etmedik
        fifthItem.printAllInfo();
		
        
        
        /*
         Employee e1 = new Employee(); 
    e1.name="Abdul";
    e1.age=100;
    e1.title="Project Manager";
    e1.salary=120000.01;
    e1.printAllInfo();
    
    Employee e2 = new Employee(); 
    e2.age = 23;
    e2.name = "Makintosh";
    e2.salary=99000.0;
    e2.title = "Dev";
    e2.printAllInfo();  
    
    Employee e3 = new Employee(); 
    e3.name="mavlida";
    e3.age=28;
    e3.title="Senior QA";
    e3.salary=100000;
    e3.printAllInfo();
    
    Employee e4=new Employee();
    e4.name="Enser";
    e4.age=24;
    e4.title="CEO";
    e4.salary=3000000;
    e4.printAllInfo();
    
    //ArrayList<String> names  = new ArrayList<>(); 
    
    
    
    ArrayList<Employee> myPeople  = new ArrayList<>(); 
    myPeople.add(e1); 
    myPeople.add(e2); 
    myPeople.add(e3); 
    myPeople.add(e4); 
    myPeople.add(  new Employee() ); 
    
    System.out.println(  myPeople.size() );
    
    //System.out.println(   myPeople.get(4)  ) ; 
    Employee firstItem = myPeople.get(0); 
    firstItem.printAllInfo();
    
    Employee secondItem = myPeople.get(1); 
    secondItem.printAllInfo();
    
    Employee thirdItem = myPeople.get(2); 
    thirdItem.printAllInfo();
    
    Employee forthItem = myPeople.get(3); 
    forthItem.printAllInfo();  
    
    Employee fifthItem = myPeople.get(4); 
    fifthItem.printAllInfo();
    
    myPeople.get(4).printAllInfo();
    
   
    

         */
		
	}

}
